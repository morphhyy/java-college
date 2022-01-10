## _Passing Paramater to Applets_

Parameters specify extra information that can be passed to an applet from the HTML page. Parameters are specified using the HTML’s param tag.

## _Param Tag_
The `<param>` tag is a sub tag of the `<applet>` tag. The `<param>` tag contains two attributes: name and value which are used to specify the name of the parameter and the value of the parameter respectively

```html
<applet>
	<param name="name" value="bibek">
</applet>

```
Now, these two parameters can be accessed in the applet program using the getParameter() method of the Applet class.

## _getParamater() Method_
The getParameter() method of the Applet class can be used to retrieve the parameters passed from the HTML page.

```java
    String getParameter(String param-name);
```
