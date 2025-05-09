package com.alibaba.ability.impl.orange;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOrangeListenerAbility;
import com.taobao.android.abilityidl.ability.OrangeListenerUpdateInfo;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.a07;
import tb.cal;
import tb.ckf;
import tb.d4d;
import tb.iih;
import tb.jdb;
import tb.kdb;
import tb.obk;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class OrangeListenerAbility extends AbsOrangeListenerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public b f1999a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(124780548);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f2000a;
        public final d4d b;

        static {
            t2o.a(124780549);
            t2o.a(613416995);
        }

        public b(OrangeListenerAbility orangeListenerAbility, String str, d4d d4dVar) {
            ckf.g(str, "groupName");
            ckf.g(d4dVar, "callback");
            this.f2000a = str;
            this.b = d4dVar;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fc05d085", new Object[]{this});
            }
            return this.f2000a;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            ckf.g(str, "namespace");
            ckf.g(map, "args");
            try {
                OrangeListenerUpdateInfo orangeListenerUpdateInfo = new OrangeListenerUpdateInfo();
                orangeListenerUpdateInfo.group = str;
                orangeListenerUpdateInfo.configVersion = String.valueOf(map.get("configVersion"));
                orangeListenerUpdateInfo.fromCache = Boolean.parseBoolean(String.valueOf(map.get("fromCache")));
                this.b.h0(orangeListenerUpdateInfo);
            } catch (Exception e) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("OrangeListenerAbility", "onConfigUpdate error: " + e.getMessage());
            }
        }
    }

    static {
        t2o.a(124780547);
    }

    public static /* synthetic */ Object ipc$super(OrangeListenerAbility orangeListenerAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/orange/OrangeListenerAbility");
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            synchronized (this) {
                if (this.f1999a != null) {
                    OrangeConfig instance = OrangeConfig.getInstance();
                    b bVar = this.f1999a;
                    ckf.d(bVar);
                    b bVar2 = this.f1999a;
                    ckf.d(bVar2);
                    instance.unregisterListener(new String[]{bVar.a()}, bVar2);
                    this.f1999a = null;
                }
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Exception e) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("OrangeListenerAbility", "onDestroy error: " + e.getMessage());
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeListenerAbility
    public void unsetListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8ee9af", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        try {
            synchronized (this) {
                if (this.f1999a != null) {
                    OrangeConfig instance = OrangeConfig.getInstance();
                    b bVar = this.f1999a;
                    ckf.d(bVar);
                    b bVar2 = this.f1999a;
                    ckf.d(bVar2);
                    instance.unregisterListener(new String[]{bVar.a()}, bVar2);
                    this.f1999a = null;
                }
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Exception e) {
            jdbVar.O(new ErrorResult("500", "未知错误: " + e.getMessage(), (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOrangeListenerAbility
    public void setListener(kdb kdbVar, cal calVar, d4d d4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1d7aad", new Object[]{this, kdbVar, calVar, d4dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(calVar, "params");
        ckf.g(d4dVar, "callback");
        try {
            synchronized (this) {
                if (this.f1999a != null) {
                    OrangeConfig instance = OrangeConfig.getInstance();
                    b bVar = this.f1999a;
                    ckf.d(bVar);
                    b bVar2 = this.f1999a;
                    ckf.d(bVar2);
                    instance.unregisterListener(new String[]{bVar.a()}, bVar2);
                }
                String str = calVar.f16941a;
                ckf.f(str, "params.group");
                this.f1999a = new b(this, str, d4dVar);
                OrangeConfig instance2 = OrangeConfig.getInstance();
                b bVar3 = this.f1999a;
                ckf.d(bVar3);
                b bVar4 = this.f1999a;
                ckf.d(bVar4);
                instance2.registerListener(new String[]{bVar3.a()}, bVar4, true);
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Exception e) {
            d4dVar.O(new ErrorResult("500", "未知错误: " + e.getMessage(), (Map) null, 4, (a07) null));
        }
    }
}
