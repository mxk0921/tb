package com.android.alibaba.ip.runtime;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PatchesLoaderDumper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(493879322);
    }

    public static void main(String[] strArr) {
        try {
            ((PatchesLoader) Class.forName("com.android.alibaba.ip.runtime.AppPatchesLoaderImpl").newInstance()).load();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }
}
