package com.taobao.android.detail2.core.framework.data.global;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import tb.o2r;
import tb.t2o;
import tb.txj;
import tb.x4m;
import tb.xmo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f7122a = xmo.b(Global.getApplication(), "");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType;

        static {
            int[] iArr = new int[NewDetailScreenConfig.ScreenType.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType = iArr;
            try {
                iArr[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(352321781);
    }

    public x4m a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4m) ipChange.ipc$dispatch("732fa47", new Object[]{this, str});
        }
        x4m x4mVar = new x4m();
        if (this.f7122a == null) {
            x4mVar.f31144a = -1;
            return x4mVar;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                x4mVar.f31144a = -1;
                return x4mVar;
            }
            Map<String, Object> map = this.f7122a;
            Object obj = map.get(str + xmo.d);
            if (obj != null) {
                x4mVar.f31144a = ((Integer) obj).intValue();
            }
            Map<String, Object> map2 = this.f7122a;
            Object obj2 = map2.get(str + xmo.c);
            if (obj2 != null) {
                x4mVar.b = (String) obj2;
            }
            Map<String, Object> map3 = this.f7122a;
            Object obj3 = map3.get(str + xmo.e);
            if (obj3 != null) {
                x4mVar.c = ((Integer) obj3).intValue();
            }
            Map<String, Object> map4 = this.f7122a;
            Object obj4 = map4.get(str + xmo.f);
            if (obj4 != null) {
                x4mVar.d = ((Integer) obj4).intValue();
            }
            Map<String, Object> map5 = this.f7122a;
            Object obj5 = map5.get(str + xmo.g);
            if (obj5 != null) {
                x4mVar.e = ((Integer) obj5).intValue();
            }
            Map<String, Object> map6 = this.f7122a;
            Object obj6 = map6.get(str + xmo.h);
            if (obj6 != null) {
                x4mVar.f = ((Integer) obj6).intValue();
            }
            return x4mVar;
        } catch (Exception e) {
            txj.f("new_detail异常", "getPlaceHolderImageModelCache解析类型异常, scene: " + str, e);
            x4mVar.f31144a = -1;
            return x4mVar;
        }
    }

    public void b(NewDetailScreenConfig.ScreenType screenType) {
        Map<String, ?> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0bae0d", new Object[]{this, screenType});
        } else if (screenType == null) {
            o2r.b();
        } else {
            if (this.f7122a == null) {
                this.f7122a = new HashMap();
            }
            int i = a.$SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[screenType.ordinal()];
            if (i == 1 || i == 2) {
                Map<String, ?> b2 = xmo.b(Global.getApplication(), NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.getUIStrategyTag());
                if (b2 != null) {
                    this.f7122a.putAll(b2);
                }
                Map<String, ?> b3 = xmo.b(Global.getApplication(), NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.getUIStrategyTag());
                if (b3 != null) {
                    this.f7122a.putAll(b3);
                }
            } else if (i == 3 && (b = xmo.b(Global.getApplication(), NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.getUIStrategyTag())) != null) {
                this.f7122a.putAll(b);
            }
        }
    }
}
