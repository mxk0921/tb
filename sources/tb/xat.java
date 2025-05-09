package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum;

        static {
            int[] iArr = new int[WatchPlatformListenerEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum = iArr;
            try {
                iArr[WatchPlatformListenerEnum.createOpenWatchContainer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.onKeyDown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.updateUri.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.isDestroyed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.onLowMemory.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.refreshByUi.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.onTrimMemory.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.onClickCloseBtn.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.refreshByIntent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.getGlobalContext.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.getUbeeContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setOnScrollListener.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onStop.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.processAddCartAction.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.procResumeForH5Embed.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setClickMoreListener.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onPause.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onCreate.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onStart.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setRoomFinishListener.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setUTDelegateCallback.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setEnableAutoShowZoomWindowAbility.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.getCurRoomIndex.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.isFloatViewShowing.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.clearScreen.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.getRecyclerView.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.onConfigurationChanged.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onResume.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.openContainer_onDestroy.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.processGoToDetailAction.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setClickCloseRoomListener.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.processGoToBulkDetailAction.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.sendBroadcasterForRecEngine.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.setSmallWindowClickListener.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[WatchPlatformListenerEnum.isForceDestroy.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    static {
        t2o.a(779093022);
        t2o.a(779093013);
    }

    public final boolean a(String str, WatchPlatformListenerEnum watchPlatformListenerEnum, Map<String, Object> map) {
        jzk jzkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a44b1c2", new Object[]{this, str, watchPlatformListenerEnum, map})).booleanValue();
        }
        if (str == null || d9m.P().fetchEntity(str) == null || d9m.P().fetchEntity(str).l() == null) {
            return false;
        }
        int i = a.$SwitchMap$com$taobao$taolive$room$openarchitecture$listener$WatchPlatformListenerEnum[watchPlatformListenerEnum.ordinal()];
        if (i == 13) {
            jzkVar = jzk.Companion.x();
        } else if (i == 28) {
            jzkVar = jzk.Companion.w();
        } else if (i != 29) {
            switch (i) {
                case 17:
                    jzkVar = jzk.Companion.C();
                    break;
                case 18:
                    jzkVar = jzk.Companion.u();
                    break;
                case 19:
                    jzkVar = jzk.Companion.B();
                    break;
                default:
                    jzkVar = null;
                    break;
            }
        } else {
            jzkVar = jzk.Companion.v();
        }
        if (jzkVar != null) {
            d9m.P().fetchEntity(str).l().q(new r2g(jzkVar, map));
        }
        return true;
    }

    public Object b(jbt jbtVar, Object... objArr) {
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
        if (!(objArr[1] instanceof WatchPlatformListenerEnum) || cfVar.c() == null) {
            return null;
        }
        return c(cfVar, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tb.cf r7, java.lang.Object... r8) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xat.c(tb.cf, java.lang.Object[]):java.lang.Object");
    }
}
