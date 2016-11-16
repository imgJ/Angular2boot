package lv.janis.angular2boot.client;

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
				+ "<h2>{{hero.name}} details!</h2>"
				+ "<div><label>id: </label>{{hero.id}}</div>"
				+ "<div><label>name: </label><input [(ngModel)]='hero.name' placeholder='name'></div>" )
@JsType
public class ApplicationComponent
{
	public String title = "Tour of Heroes";
	public Hero hero = new Hero( 1, "Windstorm" );
}
