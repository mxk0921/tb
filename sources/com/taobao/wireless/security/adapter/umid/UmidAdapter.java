package com.taobao.wireless.security.adapter.umid;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.UMIDComponent;

/* loaded from: classes.dex */
public class UmidAdapter {

    /* renamed from: а  reason: contains not printable characters */
    private static IUMIDComponent f631;

    public static int umidInitAdapter(int i) {
        try {
            IUMIDComponent iUMIDComponent = (IUMIDComponent) UMIDComponent.m227().getInterface(IUMIDComponent.class);
            f631 = iUMIDComponent;
            if (iUMIDComponent == null) {
                return 0;
            }
            iUMIDComponent.initUMIDSync(i);
            return 1;
        } catch (SecException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
