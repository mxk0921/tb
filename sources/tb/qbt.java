package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qbt implements ezd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static zat f26661a;
    public static qbt b;

    static {
        t2o.a(779093060);
        t2o.a(806355761);
    }

    public static qbt h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qbt) ipChange.ipc$dispatch("a9bb24fa", new Object[0]);
        }
        if (b == null) {
            synchronized (qbt.class) {
                b = new qbt();
            }
        }
        return b;
    }

    @Override // tb.ezd
    public Object a(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0a66a31", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        zat zatVar = f26661a;
        if (zatVar != null) {
            return zatVar.b(taoliveGatewayEnum, jbtVar, objArr);
        }
        return null;
    }

    public jbt b(Context context, String str, dzd dzdVar, bf bfVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbt) ipChange.ipc$dispatch("65a3fbfe", new Object[]{this, context, str, dzdVar, bfVar, map});
        }
        return new jbt(context, str, dzdVar, bfVar, map);
    }

    public TaoliveOpenLiveRoom c(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("594d9206", new Object[]{this, jbtVar});
        }
        a.a("com.taobao.taolive", null);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom, jbtVar, new Object[0]);
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.setTaoliveOpenService(new WeakReference<>(this));
        }
        return taoliveOpenLiveRoom;
    }

    public View d(jbt jbtVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("242d4d2e", new Object[]{this, jbtVar, taoliveOpenLiveRoom});
        }
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView, jbtVar, taoliveOpenLiveRoom);
        if (a2 instanceof View) {
            return (View) a2;
        }
        return null;
    }

    public void g(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9acc46b", new Object[]{this, jbtVar});
            return;
        }
        if (f26661a == null) {
            f26661a = new zat();
        }
        f26661a = f26661a.a(jbtVar);
    }

    public ViewGroup e(jbt jbtVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom, Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b0cb1059", new Object[]{this, jbtVar, taoliveOpenLiveRoom, activity, intent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taoliveOpenLiveRoom", taoliveOpenLiveRoom);
        hashMap.put("activity", activity);
        hashMap.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer, jbtVar, hashMap);
        if (a2 instanceof ViewGroup) {
            return (ViewGroup) a2;
        }
        return null;
    }

    public ViewGroup f(jbt jbtVar, TaoliveOpenLiveRoom taoliveOpenLiveRoom, Activity activity, String str, y3s y3sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a40798e8", new Object[]{this, jbtVar, taoliveOpenLiveRoom, activity, str, y3sVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("taoliveOpenLiveRoom", taoliveOpenLiveRoom);
        hashMap.put("activity", activity);
        hashMap.put("url", str);
        hashMap.put("tLiveRoomConfig", y3sVar);
        Object a2 = a(TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer, jbtVar, hashMap);
        if (a2 instanceof ViewGroup) {
            return (ViewGroup) a2;
        }
        return null;
    }
}
