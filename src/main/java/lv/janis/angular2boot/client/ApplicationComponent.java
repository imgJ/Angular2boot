package lv.janis.angular2boot.client;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.ng.core.Component;
import jsinterop.annotations.JsType;

/**
 * Main angular component for the application.
 *
 * <p>
 * It simply binds to the <my-app> tag.
 */
@Component(
        selector = "my-app",
        template = "<h1>{{title}}</h1>"
        + "<h2>My Heroes</h2>"
        + "<ul class='heroes'>"
        + "<li *ngFor='let hero of heroes'"
        + " (click)='onSelect(hero)'"
        + " [class.selected]='hero === selectedHero'>"
        + " <span class='badge'>{{hero.id}}</span> {{hero.name}}"
        + "</li>"
        + "</ul>"
        + "<div *ngIf='selectedHero'>"
        + "<h2>{{selectedHero.name}} details!</h2>"
        + "<div><label>id: </label>{{selectedHero.id}}</div>"
        + "<div><label>name: </label><input [(ngModel)]='selectedHero.name' placeholder='name'></div>"
        + "</div>",
        styleUrls = "application.component.css")
@JsType
public class ApplicationComponent {

    public String title = "Tour of Heroes";
    public Heroes hero = new Heroes(1, "Windstorm");

    private static final JsArray<Heroes> HEROES = JsArray.of(
            new Heroes(11, "Mr. Nice"),
            new Heroes(12, "Narco"),
            new Heroes(13, "Bombasto"),
            new Heroes(14, "Celeritas"),
            new Heroes(15, "Magneta"),
            new Heroes(16, "RubberMan"),
            new Heroes(17, "Dynama"),
            new Heroes(18, "Dr IQ"),
            new Heroes(19, "Magma"),
            new Heroes(20, "Tornado"));

    public JsArray<Heroes> heroes = HEROES;

    public Heroes selectedHero = null;

    public void onSelect(Heroes hero) {
        selectedHero = hero;
    }
}
