package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum;

        static {
            int[] iArr = new int[H5PlatfomListenerEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum = iArr;
            try {
                iArr[H5PlatfomListenerEnum.play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.stop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.resume.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.isMuted.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onPause.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onResume.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.setMuted.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onDestroy.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.subscribePM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.unsubscribePM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.getConfiguration.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.setConfiguration.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onAttachedToWebView.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onVisibilityChanged.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.onDetachedFromWebView.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[H5PlatfomListenerEnum.getSessionInfo.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    static {
        t2o.a(779093019);
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
        if (!(objArr[1] instanceof H5PlatfomListenerEnum) || cfVar.c() == null) {
            return null;
        }
        return b(cfVar, objArr);
    }

    public final Object b(cf cfVar, Object... objArr) {
        Object[] objArr2;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("97f3ca26", new Object[]{this, cfVar, objArr});
        }
        if ((objArr[1] instanceof H5PlatfomListenerEnum) && cfVar.c() != null) {
            H5PlatfomListenerEnum h5PlatfomListenerEnum = (H5PlatfomListenerEnum) objArr[1];
            q3d N = cfVar.c().N();
            Object obj2 = objArr[2];
            if (obj2 != null) {
                objArr2 = (Object[]) obj2;
            } else {
                objArr2 = null;
            }
            if (objArr2 == null || objArr2.length <= 0) {
                obj = null;
            } else {
                obj = objArr2[0];
            }
            switch (a.$SwitchMap$com$taobao$taolive$room$openarchitecture$listener$H5PlatfomListenerEnum[h5PlatfomListenerEnum.ordinal()]) {
                case 1:
                    if (N != null) {
                        N.n(obj);
                        break;
                    }
                    break;
                case 2:
                    if (N != null) {
                        N.C(obj);
                        break;
                    }
                    break;
                case 3:
                    if (N != null) {
                        N.w(obj);
                        break;
                    }
                    break;
                case 4:
                    if (N != null) {
                        N.G(obj);
                        break;
                    }
                    break;
                case 5:
                    if (N != null) {
                        N.b(obj);
                        break;
                    }
                    break;
                case 6:
                    if (N != null) {
                        N.a(obj);
                        break;
                    }
                    break;
                case 7:
                    if (N != null) {
                        N.f(obj);
                        break;
                    }
                    break;
                case 8:
                    if (N != null) {
                        N.c(obj);
                        break;
                    }
                    break;
                case 9:
                    if (N != null) {
                        N.p(obj);
                        break;
                    }
                    break;
                case 10:
                    if (N != null) {
                        N.I(obj);
                        break;
                    }
                    break;
                case 11:
                    if (N != null) {
                        N.q(obj);
                        break;
                    }
                    break;
                case 12:
                    if (N != null) {
                        N.A(obj);
                        break;
                    }
                    break;
                case 13:
                    if (N != null) {
                        N.l(obj);
                        break;
                    }
                    break;
                case 14:
                    if (N != null) {
                        N.m(obj);
                        break;
                    }
                    break;
                case 15:
                    if (N != null) {
                        N.B(obj);
                        break;
                    }
                    break;
                case 16:
                    if (N != null) {
                        N.F(obj);
                        break;
                    }
                    break;
            }
        }
        return null;
    }
}
