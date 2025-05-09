package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INFOFLOWCARDWIDTH = -8936854687533104177L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31469a;

    static {
        t2o.a(486539384);
    }

    public xm5() {
        boolean z;
        if (eue.a() == null || (!TBDeviceUtils.P(eue.a()) && !TBDeviceUtils.p(eue.a()))) {
            z = false;
        } else {
            z = true;
        }
        this.f31469a = z;
    }

    public static /* synthetic */ Object ipc$super(xm5 xm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserInfoFlowCardWidth");
    }

    public final int a(cfc cfcVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77114dac", new Object[]{this, cfcVar})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return 0;
        }
        try {
            return ext.getIntValue("cardSpace");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int b(cfc cfcVar, Context context) {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f67204a5", new Object[]{this, cfcVar, context})).intValue();
        }
        if (this.f31469a && (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class)) != null) {
            return iFoldDeviceAndPadService.getInfoFlowAdaptiveColumn(context);
        }
        return 2;
    }

    public final Activity c(cfc cfcVar) {
        u5d j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("cb8c7bbc", new Object[]{this, cfcVar});
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return null;
        }
        Context f = j.f();
        if (f instanceof Activity) {
            return (Activity) f;
        }
        return null;
    }

    public final int d(Context context, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55b46c76", new Object[]{this, context, cfcVar})).intValue();
        }
        if (!(context instanceof Activity)) {
            return TBAutoSizeConfig.x().H(context);
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed()) {
            activity = c(cfcVar);
        }
        if (activity == null) {
            return TBAutoSizeConfig.x().H(context);
        }
        return rhx.a(activity).width();
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.r() == null) {
            return Integer.valueOf(pb6.c(eue.a(), 171.0f));
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            return Integer.valueOf(pb6.c(eue.a(), 171.0f));
        }
        DinamicXEngine r = dXRuntimeContext.r();
        Context h = dXRuntimeContext.h();
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (e != null) {
            if (e.slimSection()) {
                i2 = (e.getStyle() == null || e.getStyle().getStyleData() == null) ? 0 : e.getStyle().getStyleData().getIntValue("marginSide") / 2;
            } else {
                i2 = e.getExt().getIntValue("marginSide") / 2;
            }
            i = pb6.d(r, h, i2);
        } else {
            i = 0;
        }
        int d = pb6.d(r, h, a(c) / 2);
        if (d <= 0) {
            return Integer.valueOf(pb6.c(eue.a(), 171.0f));
        }
        int c2 = mue.c(r, i);
        if (c2 != mue.f24315a) {
            return Integer.valueOf(c2);
        }
        int b = b(c, h);
        if (b <= 0) {
            fve.e("DXDataParserInfoFlowCardWidth", "column less zero");
            return Integer.valueOf(pb6.d(r, h, 171.0f));
        }
        int d2 = d(h, c);
        int round = Math.round(((d2 - (i * 2)) - ((b - 1) * d)) / b);
        mue.b(r, i, round);
        fve.e("DXDataParserInfoFlowCardWidth", "info flow card width: " + round + " screenWidth: " + d2 + " marginSide: " + i + " column: " + b + " space: " + d);
        return Integer.valueOf(Math.max(round, 0));
    }
}
