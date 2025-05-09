package com.taobao.android.detail2.core.framework.secondpage;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.txj;
import tb.ze;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SecondPageFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<SecondPageType, Class<? extends ze>> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f7147a;
    public final Map<SecondPageType, ze> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum SecondPageType {
        GG_PROFILE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SecondPageType secondPageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/secondpage/SecondPageFactory$SecondPageType");
        }

        public static SecondPageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SecondPageType) ipChange.ipc$dispatch("90a392e4", new Object[]{str});
            }
            return (SecondPageType) Enum.valueOf(SecondPageType.class, str);
        }
    }

    static {
        t2o.a(352321910);
    }

    public SecondPageFactory(Context context) {
        this.f7147a = context;
    }

    public static void b(SecondPageType secondPageType, Class<? extends ze> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3892348f", new Object[]{secondPageType, cls});
        } else if (secondPageType != null && cls != null) {
            txj.e(txj.TAG_SECOND_PAGE, "注册二级页类，二级页类型" + secondPageType + "，二级页类名" + cls.getName());
            ((HashMap) c).put(secondPageType, cls);
        }
    }

    public ze a(SecondPageType secondPageType) {
        Exception e;
        ze zeVar;
        if (secondPageType == null) {
            return null;
        }
        Map<SecondPageType, ze> map = this.b;
        ze zeVar2 = (ze) ((HashMap) map).get(secondPageType);
        if (zeVar2 != null) {
            return zeVar2;
        }
        Class cls = (Class) ((HashMap) c).get(secondPageType);
        if (cls == null) {
            return null;
        }
        try {
            zeVar = (ze) cls.getConstructor(Context.class).newInstance(this.f7147a);
        } catch (Exception e2) {
            e = e2;
        }
        try {
            ((HashMap) map).put(secondPageType, zeVar);
            return zeVar;
        } catch (Exception e3) {
            e = e3;
            zeVar2 = zeVar;
            txj.f("new_detail异常", "创建二级页对象异常", e);
            e.printStackTrace();
            return zeVar2;
        }
    }
}
