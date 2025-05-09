package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: a  reason: collision with root package name */
    private AbstractWindowedCursor f5327a;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor == null) {
            throw new IllegalArgumentException("cursor cannot be null");
        } else if (cursor instanceof CursorWrapper) {
            Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
            if (wrappedCursor == null) {
                throw new IllegalArgumentException("getWrappedCursor cannot be null");
            } else if (wrappedCursor instanceof AbstractWindowedCursor) {
                this.f5327a = (AbstractWindowedCursor) wrappedCursor;
            } else {
                throw new IllegalArgumentException("getWrappedCursor:" + wrappedCursor + " is not a subclass for CursorWrapper");
            }
        } else {
            throw new IllegalArgumentException("cursor:" + cursor + " is not a subclass for CursorWrapper");
        }
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f5327a.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.f5327a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.f5327a;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return this.f5327a.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.f5327a.setWindow(cursorWindow);
    }
}
