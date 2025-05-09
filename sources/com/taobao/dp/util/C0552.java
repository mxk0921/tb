package com.taobao.dp.util;

import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import java.util.ArrayList;

/* renamed from: com.taobao.dp.util.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0552 {

    /* renamed from: а  reason: contains not printable characters */
    private Object f515 = new Object();

    /* renamed from: б  reason: contains not printable characters */
    private ArrayList<IUMIDInitListenerEx> f516 = new ArrayList<>();

    /* renamed from: в  reason: contains not printable characters */
    private ArrayList<IUMIDInitListenerEx> f517 = new ArrayList<>();

    /* renamed from: г  reason: contains not printable characters */
    private ArrayList<IUMIDInitListenerEx> f518 = new ArrayList<>();

    /* renamed from: а  reason: contains not printable characters */
    public ArrayList<IUMIDInitListenerEx> m328(int i) {
        ArrayList<IUMIDInitListenerEx> arrayList;
        synchronized (this.f515) {
            if (i == 0) {
                arrayList = this.f516;
                this.f516 = new ArrayList<>();
            } else if (i == 1) {
                arrayList = this.f517;
                this.f517 = new ArrayList<>();
            } else if (i != 2) {
                arrayList = null;
            } else {
                arrayList = this.f518;
                this.f518 = new ArrayList<>();
            }
        }
        return arrayList;
    }

    /* renamed from: б  reason: contains not printable characters */
    public void m329(int i, IUMIDInitListenerEx iUMIDInitListenerEx) {
        synchronized (this.f515) {
            ArrayList<IUMIDInitListenerEx> arrayList = i != 0 ? i != 1 ? i != 2 ? null : this.f518 : this.f517 : this.f516;
            if (!(arrayList == null || iUMIDInitListenerEx == null)) {
                arrayList.add(iUMIDInitListenerEx);
            }
        }
    }
}
