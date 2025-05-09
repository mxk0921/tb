package com.alibaba.wireless.security.open.edgecomputing;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public class InnerDisplayListener implements DisplayManager.DisplayListener {
    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
        try {
            C0165.m221().doCommand(13813, Integer.valueOf(i), 1);
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        try {
            C0165.m221().doCommand(13813, Integer.valueOf(i), 3);
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
        try {
            C0165.m221().doCommand(13813, Integer.valueOf(i), 2);
        } catch (Exception unused) {
        }
    }
}
