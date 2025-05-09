package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum;

        static {
            int[] iArr = new int[PlatformListenerEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum = iArr;
            try {
                iArr[PlatformListenerEnum.callVideoStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onFollowAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.callReportAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onUnfollowAciton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.callFetchUTArgsWithParams.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.updateUserTrackData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.needPresentAvatarPage.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onCreate.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onStart.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onWillAppear.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDidAppear.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onWillDisappear.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDidDisappear.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onPause.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onResume.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onStop.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.onDestory.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.setSmallWindowClickListener.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.setContainerOffset.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.mute.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[PlatformListenerEnum.getVideoInfo.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr2 = new int[AccessListenerEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum = iArr2;
            try {
                iArr2[AccessListenerEnum.onVerticalScrollDisable.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onVerticalScrollEnable.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onHorizontalScrollEnable.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onHorizontalScrollDisable.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onUnfollowAciton.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onFollowAction.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onLiveRoomMuteAction.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onLiveRoomWatchCountChange.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onClickCleanScreen.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onFloatViewShow.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onLive.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onReplay.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onPrelive.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.streamPlay.ordinal()] = 14;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.liveRoomEnd.ordinal()] = 15;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.playerError.ordinal()] = 16;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.streamPause.ordinal()] = 17;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.liveRoomUserLeave.ordinal()] = 18;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.playerFirstFrameRender.ordinal()] = 19;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.onRecieveDetailResponse.ordinal()] = 20;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.postInteractiveMsg.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.mtopRequestSuccess.ordinal()] = 22;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[AccessListenerEnum.mtopRequestFail.ordinal()] = 23;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    static {
        t2o.a(779093015);
        t2o.a(779093013);
    }

    public Object a(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b52bb13", new Object[]{this, jbtVar, objArr});
        }
        if (objArr == null) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof cf)) {
            return null;
        }
        cf cfVar = (cf) obj;
        if ((objArr[1] instanceof AccessListenerEnum) && cfVar.a() != null) {
            b(cfVar, objArr);
        }
        if (!(objArr[1] instanceof PlatformListenerEnum) || cfVar.c() == null) {
            return null;
        }
        return c(cfVar, objArr);
    }

    public final void d(Object[] objArr, AccessListenerEnum accessListenerEnum, yrk yrkVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25230133", new Object[]{this, objArr, accessListenerEnum, yrkVar});
        } else if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && yrkVar != null) {
            if (accessListenerEnum == AccessListenerEnum.mtopRequestSuccess) {
                yrkVar.B(obj);
            } else if (accessListenerEnum == AccessListenerEnum.mtopRequestFail) {
                yrkVar.A(obj);
            }
        }
    }

    public final void b(cf cfVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f104bb", new Object[]{this, cfVar, objArr});
        } else if ((objArr[1] instanceof AccessListenerEnum) && cfVar.a() != null) {
            AccessListenerEnum accessListenerEnum = (AccessListenerEnum) objArr[1];
            bmc b = cfVar.a().b();
            v2d c = cfVar.a().c();
            x2d d = cfVar.a().d();
            yrk a2 = cfVar.a().a();
            Object obj = objArr[2];
            Object[] objArr2 = obj != null ? (Object[]) obj : null;
            switch (a.$SwitchMap$com$taobao$taolive$room$openarchitecture$listener$AccessListenerEnum[accessListenerEnum.ordinal()]) {
                case 1:
                    if (d != null) {
                        d.p();
                        return;
                    }
                    return;
                case 2:
                    if (d != null) {
                        d.d();
                        return;
                    }
                    return;
                case 3:
                    if (d != null) {
                        d.s();
                        return;
                    }
                    return;
                case 4:
                    if (d != null) {
                        d.n();
                        return;
                    }
                    return;
                case 5:
                    if (c != null && objArr2 != null && objArr2.length > 0) {
                        Object obj2 = objArr2[0];
                        if (obj2 instanceof Map) {
                            Map map = (Map) obj2;
                            c.c((String) map.get("accountId"), (String) map.get("accountType"), (String) map.get("followSource"));
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    if (c != null && objArr2 != null && objArr2.length > 0) {
                        Object obj3 = objArr2[0];
                        if (obj3 instanceof Map) {
                            Map map2 = (Map) obj3;
                            c.b((String) map2.get("accountId"), (String) map2.get("accountType"), (String) map2.get("followSource"));
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    if (a2 != null && objArr2 != null && objArr2.length > 0) {
                        Object obj4 = objArr2[0];
                        if (obj4 instanceof Map) {
                            a2.z((Map) obj4);
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    if (c != null && objArr2 != null && objArr2.length > 0) {
                        Object obj5 = objArr2[0];
                        if (obj5 instanceof Map) {
                            c.t((String) ((Map) obj5).get("watchNumberDes"));
                            return;
                        }
                        return;
                    }
                    return;
                case 9:
                    if (c != null && objArr2 != null && objArr2.length > 0) {
                        Object obj6 = objArr2[0];
                        if (obj6 instanceof Boolean) {
                            c.e(((Boolean) obj6).booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                case 10:
                    if (a2 != null) {
                        a2.v();
                        return;
                    }
                    return;
                case 11:
                    if (b != null) {
                        b.k();
                        return;
                    }
                    return;
                case 12:
                    if (b != null) {
                        b.r();
                        return;
                    }
                    return;
                case 13:
                    if (b != null) {
                        b.g();
                        return;
                    }
                    return;
                case 14:
                    if (b != null) {
                        b.l();
                        return;
                    }
                    return;
                case 15:
                    if (b != null) {
                        b.o();
                        return;
                    }
                    return;
                case 16:
                    if (b != null) {
                        b.i();
                        return;
                    }
                    return;
                case 17:
                    if (b != null) {
                        b.q();
                        return;
                    }
                    return;
                case 18:
                    if (b != null) {
                        b.h();
                        return;
                    }
                    return;
                case 19:
                    if (b != null) {
                        b.j();
                        return;
                    }
                    return;
                case 20:
                    if (objArr2 != null && objArr2.length > 0 && objArr2[0] != null) {
                        cfVar.a().e(objArr2[0]);
                        if (a2 != null) {
                            a2.C(objArr2[0]);
                            return;
                        }
                        return;
                    }
                    return;
                case 21:
                    if (a2 != null && objArr2 != null && objArr2.length > 0) {
                        a2.y(sr4.d(objArr2[0], null), sr4.d(objArr2[1], null));
                        return;
                    }
                    return;
                case 22:
                    d(objArr2, AccessListenerEnum.mtopRequestSuccess, a2);
                    return;
                case 23:
                    d(objArr2, AccessListenerEnum.mtopRequestFail, a2);
                    return;
                default:
                    return;
            }
        }
    }

    public final Object c(cf cfVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("97f3ca26", new Object[]{this, cfVar, objArr});
        }
        if ((objArr[1] instanceof PlatformListenerEnum) && cfVar.c() != null) {
            PlatformListenerEnum platformListenerEnum = (PlatformListenerEnum) objArr[1];
            u3d O = cfVar.c().O();
            z3d Q = cfVar.c().Q();
            a4d R = cfVar.c().R();
            Object obj = objArr[2];
            Object[] objArr2 = obj != null ? (Object[]) obj : null;
            switch (a.$SwitchMap$com$taobao$taolive$room$openarchitecture$listener$PlatformListenerEnum[platformListenerEnum.ordinal()]) {
                case 1:
                    if (O != null) {
                        O.a();
                        break;
                    }
                    break;
                case 2:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Map map = (Map) objArr2[0];
                        Q.b((String) map.get("accountId"), (String) map.get("accountType"), (String) map.get("followSource"));
                        break;
                    }
                    break;
                case 3:
                    if (Q != null) {
                        Q.e();
                        break;
                    }
                    break;
                case 4:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Map map2 = (Map) objArr2[0];
                        Q.c((String) map2.get("accountId"), (String) map2.get("accountType"), (String) map2.get("followSource"));
                        break;
                    }
                    break;
                case 5:
                    if (Q != null) {
                        return Q.f();
                    }
                    break;
                case 6:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Q.updateUserTrackData((Map) objArr2[0]);
                        break;
                    }
                    break;
                case 7:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Q.needPresentAvatarPage((Map) objArr2[0]);
                        break;
                    }
                    break;
                case 8:
                    if (!(R == null || objArr2 == null || objArr2.length <= 0)) {
                        R.h(objArr2[0]);
                        break;
                    }
                    break;
                case 9:
                    if (R != null) {
                        R.onStart(null);
                        break;
                    }
                    break;
                case 10:
                    if (R != null) {
                        R.e(null);
                        break;
                    }
                    break;
                case 11:
                    if (R != null) {
                        R.f(null);
                        break;
                    }
                    break;
                case 12:
                    if (R != null) {
                        R.c(null);
                        break;
                    }
                    break;
                case 13:
                    if (R != null) {
                        R.d(null);
                        break;
                    }
                    break;
                case 14:
                    if (R != null) {
                        R.b(null);
                        break;
                    }
                    break;
                case 15:
                    if (R != null) {
                        R.a(null);
                        break;
                    }
                    break;
                case 16:
                    if (R != null) {
                        R.g((objArr2 == null || objArr2.length <= 0) ? null : (Map) objArr2[0]);
                        break;
                    }
                    break;
                case 17:
                    if (R != null) {
                        R.i(null);
                        break;
                    }
                    break;
                case 18:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Map map3 = (Map) objArr2[0];
                        if (!(map3.get(DataReceiveMonitor.CB_LISTENER) instanceof q4q)) {
                            Q.d(null);
                            break;
                        } else {
                            Q.d((q4q) map3.get(DataReceiveMonitor.CB_LISTENER));
                            break;
                        }
                    }
                    break;
                case 19:
                    x5t.d("setContainerOffset", "沉浸式设置，直播间收到setContainerOffset");
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Object obj2 = objArr2[0];
                        if (obj2 instanceof JSONObject) {
                            Q.setContainerOffset((JSONObject) obj2);
                            break;
                        }
                    }
                    break;
                case 20:
                    if (!(Q == null || objArr2 == null || objArr2.length <= 0)) {
                        Q.mute(yqq.h((String) ((Map) objArr2[0]).get("isMute")));
                        break;
                    }
                    break;
                case 21:
                    if (Q != null) {
                        return Q.a();
                    }
                    break;
            }
        }
        return null;
    }
}
