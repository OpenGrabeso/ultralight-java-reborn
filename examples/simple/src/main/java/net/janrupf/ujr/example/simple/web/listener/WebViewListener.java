package net.janrupf.ujr.example.simple.web.listener;

import net.janrupf.ujr.api.UltralightView;
import net.janrupf.ujr.api.cursor.UlCursor;
import net.janrupf.ujr.api.listener.UltralightViewListener;
import net.janrupf.ujr.example.simple.web.CursorTranslator;
import net.janrupf.ujr.example.simple.web.WebWindow;

public class WebViewListener implements UltralightViewListener {
    private final WebWindow window;

    public WebViewListener(WebWindow window) {
        this.window = window;
    }

    @Override
    public void onChangeCursor(UltralightView view, UlCursor cursor) {
        int cursorId = CursorTranslator.ultralightToGlfwCursor(cursor);
        window.getWindow().setCursor(cursorId);
    }
}
