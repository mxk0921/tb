package com.alibaba.android.ultron.inter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.rsd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface UltronDebugInterface extends Serializable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f2296a = new HashMap();

        static {
            t2o.a(154140679);
        }

        public Map<String, Object> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            return this.f2296a;
        }

        public a b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4244cfb9", new Object[]{this, str, obj});
            }
            ((HashMap) this.f2296a).put(str, obj);
            return this;
        }
    }

    void destroy();

    String getBizName();

    Context getContext();

    void init(Context context);

    boolean isConnectedStudio();

    void onCreate();

    void onPause();

    void onResume();

    void registerStatusCallback(String str, rsd rsdVar);

    void registerStatusListener(rsd rsdVar);

    void sendStatusCallback(String str, Map<String, Object> map);

    void sendStatusEvent(String str, Map<String, Object> map);
}
