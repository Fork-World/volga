package org.vaadin.volga;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.UI;

public abstract class VolgaUI extends UI {

    @Override
    protected void init(VaadinRequest request) {

        doInit(request);
    }

    protected abstract void doInit(VaadinRequest request);

    protected abstract ComponentContainer getContainer();
}
