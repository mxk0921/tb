package com.android.taobao.safeclean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface b<T> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements b<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(654311436);
            t2o.a(654311434);
        }

        /* renamed from: b */
        public boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae3dfc75", new Object[]{this, str, str2})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.android.taobao.safeclean.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class C0233b implements b<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(654311438);
            t2o.a(654311434);
        }

        /* renamed from: b */
        public boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae3dfc75", new Object[]{this, str, str2})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
                return true;
            }
            return false;
        }
    }
}
