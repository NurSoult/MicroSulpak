package kz.bitlab.springboot.task11.controller;


import kz.bitlab.springboot.task11.db.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model) {
        ArrayList<Items> items = DBManager.getItems();
        model.addAttribute("items", items);

        return "index";
    }

    @GetMapping(value = "/add-item-page")
    public String addItemPage() {
        return "add_item_page";
    }

    @PostMapping(value = "/add-item")
    public String addItem(Items item) {
        DBManager.addItem(item);

        return "redirect:/";
    }

    @GetMapping(value = "/details/{itemId}")
    public String itemDetail(@PathVariable(name = "itemId") Long id, Model model) {
        Items selectedItem = null;
        ArrayList<Items> items = DBManager.getItems();

        for (Items i : items) {
            if (i.getId() == id) {
                selectedItem = i;
                break;
            }
        }
        model.addAttribute("item", selectedItem);

        return "details";
    }
}
