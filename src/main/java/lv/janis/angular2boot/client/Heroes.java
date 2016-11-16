package lv.janis.angular2boot.client;

import jsinterop.annotations.JsType;

@JsType
public class Heroes {

    public int id;
    public String name;

    public Heroes(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
