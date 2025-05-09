package com.taobao.themis.kernel.adapter;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.n8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface INavigatorAdapter extends n8s {
    public static final String ALLOW_ESCAPE = "allowEscape";
    public static final String CATEGORY = "category";
    public static final String CLASS_NAME = "className";
    public static final a Companion = a.$$INSTANCE;
    public static final String DISABLE_TRANSITION = "disableTransition";
    public static final String DISALLOW_LOOPBACK = "disallowLoopback";
    public static final String SKIP_ALL_PROCESSOR = "skipAllProcessor";
    public static final String SKIP_PRE_PROCESSOR = "skipPreProcessor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String ALLOW_ESCAPE = "allowEscape";
        public static final String CATEGORY = "category";
        public static final String CLASS_NAME = "className";
        public static final String DISABLE_TRANSITION = "disableTransition";
        public static final String DISALLOW_LOOPBACK = "disallowLoopback";
        public static final String SKIP_ALL_PROCESSOR = "skipAllProcessor";
        public static final String SKIP_PRE_PROCESSOR = "skipPreProcessor";

        static {
            t2o.a(839909477);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909478);
        }

        public static /* synthetic */ boolean a(INavigatorAdapter iNavigatorAdapter, Context context, String str, Bundle bundle, Bundle bundle2, Map map, int i, Object obj) {
            Bundle bundle3;
            Bundle bundle4;
            Map map2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c73bb9d", new Object[]{iNavigatorAdapter, context, str, bundle, bundle2, map, new Integer(i), obj})).booleanValue();
            }
            if (obj == null) {
                if ((i & 4) != 0) {
                    bundle3 = null;
                } else {
                    bundle3 = bundle;
                }
                if ((i & 8) != 0) {
                    bundle4 = null;
                } else {
                    bundle4 = bundle2;
                }
                if ((i & 16) != 0) {
                    map2 = null;
                } else {
                    map2 = map;
                }
                return iNavigatorAdapter.openURL(context, str, bundle3, bundle4, map2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openURL");
        }
    }

    boolean openURL(Context context, String str, Bundle bundle, Bundle bundle2, Map<String, ? extends Object> map);
}
