## _Java CardLayout__
The Java CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.

## _Constructors of CardLayout Class_

- `CardLayout()`

    creates a card layout with zero horizontal and vertical gap.

- `CardLayout(int hgap, int vgap)`

    creates a card layout with the given horizontal and vertical gap.

## _Commonly Used Methods of CardLayout Class_

- `public void next(Container parent)` 

    used to flip to the next card of the given container.

- `public void previous(Container parent)`
    
    used to flip to the previous card of the given container.

- `public void first(Container parent)`

    used to flip to the first card of the given container.

- `public void last(Container parent)`

    used to flip to the last card of the given container.

- `public void show(Container parent, String name)`

    used to flip to the specified card with the given name.


## _Popup and PopupFactory_
Popup and PopupFactory are a part of the Java Swing library. Popups are used when we want to display to the user a Component on the top of all the other Components in that particular containment hierarchy. PopupFactory is the class that is used to create popups.

## _Constructor_
`PopupFactory()`: creates an object for popup factory.

## _Methods_
- `getPopup(Component o, Component c, int x, int y)`	
        
    Creates a Popup for the Component o containing the Component c at a location x, y on the owner component.

- `hide()`	

    Hides and disposes of the Popup.

- `show()`
    
    Makes the Popup visible.
