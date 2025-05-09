package com.alibaba.ability.impl.riverlogtoggle;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.jpu;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RiverlogToggleAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_TOGGLE = "toggle";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2017a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(127926275);
        }

        public a() {
        }

        @JvmStatic
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("42e0a630", new Object[]{this})).booleanValue();
            }
            return RiverlogToggleAbility.access$getRiverLogEnable$cp();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(127926274);
    }

    public static final /* synthetic */ boolean access$getRiverLogEnable$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4170c38b", new Object[0])).booleanValue();
        }
        return f2017a;
    }

    public static final /* synthetic */ void access$setRiverLogEnable$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eebfc39", new Object[]{new Boolean(z)});
        } else {
            f2017a = z;
        }
    }

    public static /* synthetic */ Object ipc$super(RiverlogToggleAbility riverlogToggleAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/riverlogtoggle/RiverlogToggleAbility");
    }

    @JvmStatic
    public static final boolean isEnableRiverlog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42e0a630", new Object[0])).booleanValue();
        }
        return Companion.a();
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (str.hashCode() != -868304044 || !str.equals(API_TOGGLE)) {
            return ErrorResult.a.Companion.a("api not found");
        }
        Boolean g = MegaUtils.g(map, "enable", Boolean.FALSE);
        f2017a = g != null ? g.booleanValue() : false;
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("success", Boolean.TRUE))), null, 2, null);
    }
}
