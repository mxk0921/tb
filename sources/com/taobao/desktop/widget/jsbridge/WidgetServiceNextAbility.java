package com.taobao.desktop.widget.jsbridge;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility;
import com.taobao.android.abilityidl.ability.WidgetServiceEditSuccessResult;
import tb.bkb;
import tb.cee;
import tb.kdb;
import tb.lcx;
import tb.mcx;
import tb.ncx;
import tb.ocx;
import tb.scx;
import tb.sd7;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetServiceNextAbility extends AbsWidgetServiceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements bkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cee f10327a;

        public a(WidgetServiceNextAbility widgetServiceNextAbility, cee ceeVar) {
            this.f10327a = ceeVar;
        }

        @Override // tb.bkb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e344e027", new Object[]{this, str});
                return;
            }
            WidgetServiceEditSuccessResult widgetServiceEditSuccessResult = new WidgetServiceEditSuccessResult();
            widgetServiceEditSuccessResult.result = Boolean.valueOf(Boolean.parseBoolean(str));
            cee ceeVar = this.f10327a;
            if (ceeVar != null) {
                ceeVar.l0(widgetServiceEditSuccessResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements bkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cee f10328a;

        public b(WidgetServiceNextAbility widgetServiceNextAbility, cee ceeVar) {
            this.f10328a = ceeVar;
        }

        @Override // tb.bkb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e344e027", new Object[]{this, str});
                return;
            }
            WidgetServiceEditSuccessResult widgetServiceEditSuccessResult = new WidgetServiceEditSuccessResult();
            widgetServiceEditSuccessResult.result = Boolean.valueOf(Boolean.parseBoolean(str));
            cee ceeVar = this.f10328a;
            if (ceeVar != null) {
                ceeVar.l0(widgetServiceEditSuccessResult);
            }
        }
    }

    static {
        t2o.a(437256243);
    }

    public static /* synthetic */ Object ipc$super(WidgetServiceNextAbility widgetServiceNextAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/jsbridge/WidgetServiceNextAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public tao<Boolean, ErrorResult> addWidget(kdb kdbVar, lcx lcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("7cfe2f37", new Object[]{this, kdbVar, lcxVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) lcxVar.f23265a);
            jSONObject.put("widgetType", (Object) lcxVar.b);
            jSONObject.put("channel", (Object) lcxVar.c);
            return new tao<>(Boolean.valueOf(ncx.c(sd7.d().a(), "addWidget", JSON.toJSONString(jSONObject), null)));
        } catch (Exception e) {
            return new tao<>(null, ErrorResult.a.g(e.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public void editWidget(kdb kdbVar, mcx mcxVar, cee ceeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe2eb93", new Object[]{this, kdbVar, mcxVar, ceeVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) mcxVar.f23954a);
            jSONObject.put("widgetId", (Object) mcxVar.b);
            ncx.c(sd7.d().a(), "editWidget", JSON.toJSONString(jSONObject), new b(this, ceeVar));
        } catch (Exception e) {
            if (ceeVar != null) {
                ceeVar.O(ErrorResult.a.g(e.getMessage()));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public void isInstalled(kdb kdbVar, ocx ocxVar, cee ceeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a749e", new Object[]{this, kdbVar, ocxVar, ceeVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) ocxVar.f25304a);
            jSONObject.put("widgetType", (Object) ocxVar.b);
            ncx.c(sd7.d().a(), "isInstalled", JSON.toJSONString(jSONObject), new a(this, ceeVar));
        } catch (Exception e) {
            if (ceeVar != null) {
                ceeVar.O(ErrorResult.a.g(e.getMessage()));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public tao<Boolean, ErrorResult> isSupported(kdb kdbVar, scx scxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("9c2b01c4", new Object[]{this, kdbVar, scxVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) scxVar.f27960a);
            return new tao<>(Boolean.valueOf(ncx.c(sd7.d().a(), "isSupported", JSON.toJSONString(jSONObject), null)));
        } catch (Exception e) {
            return new tao<>(null, ErrorResult.a.g(e.getMessage()));
        }
    }
}
