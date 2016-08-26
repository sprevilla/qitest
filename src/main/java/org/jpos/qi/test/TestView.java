package org.jpos.qi.test;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import org.jpos.qi.QI;

public class TestView extends VerticalLayout implements View {
    public TestView () {
        setSizeFull();
        addComponent(new Label("This is a test"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) { }
}
