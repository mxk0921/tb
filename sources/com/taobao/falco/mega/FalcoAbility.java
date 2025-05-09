package com.taobao.falco.mega;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFalcoAbility;
import java.util.HashMap;
import java.util.Map;
import tb.jdb;
import tb.kdb;
import tb.mz8;
import tb.s9u;
import tb.ty8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoAbility extends AbsFalcoAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements mz8.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10472a;

        public a(FalcoAbility falcoAbility, Map map) {
            this.f10472a = map;
        }

        @Override // tb.mz8.a
        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("703083e1", new Object[]{this});
            }
            return this.f10472a;
        }
    }

    public static /* synthetic */ Object ipc$super(FalcoAbility falcoAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/mega/FalcoAbility");
    }

    public final Map<String, String> a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a1f80bc", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value.toString());
            } else {
                hashMap.put(key, null);
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFalcoAbility
    public void updateScreenshotMonitorParams(kdb kdbVar, ty8 ty8Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55681c9b", new Object[]{this, kdbVar, ty8Var, jdbVar});
            return;
        }
        mz8 g = s9u.u().g();
        if (g == null) {
            jdbVar.O(new ErrorResult(100, "截屏埋点注册失败：功能关闭", (Map<String, ? extends Object>) null));
            return;
        }
        Map<String, ? extends Object> map = ty8Var.b;
        if (map == null || map.size() <= 0) {
            if (!g.unregisterListener(ty8Var.f29030a)) {
                jdbVar.O(new ErrorResult(100, "截屏埋点解注册失败：bizid不能为空且长度不能超过100", (Map<String, ? extends Object>) null));
            }
        } else if (!g.a(ty8Var.f29030a, new a(this, a(ty8Var.b)))) {
            jdbVar.O(new ErrorResult(100, "截屏埋点注册失败：bizid不能为空且长度不能超过100", (Map<String, ? extends Object>) null));
        }
    }
}
