package com.alibaba.security.realidentity.service.media.audio;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.h3;
import com.alibaba.security.realidentity.j;
import com.alibaba.security.realidentity.t4;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPMediaPlayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2816a;
    public h3 b;
    public final t4 d;
    public final Runnable e = new a();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (RPMediaPlayManager.a(RPMediaPlayManager.this).g() != null && RPMediaPlayManager.a(RPMediaPlayManager.this).i()) {
                RPMediaPlayManager rPMediaPlayManager = RPMediaPlayManager.this;
                rPMediaPlayManager.b(RPMediaPlayManager.a(rPMediaPlayManager).g());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2818a;

        static {
            int[] iArr = new int[ABDetectType.values().length];
            f2818a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f2818a;
                ABDetectType aBDetectType = ABDetectType.NONE;
                iArr2[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f2818a;
                ABDetectType aBDetectType2 = ABDetectType.NONE;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f2818a;
                ABDetectType aBDetectType3 = ABDetectType.NONE;
                iArr4[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f2818a;
                ABDetectType aBDetectType4 = ABDetectType.NONE;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f2818a;
                ABDetectType aBDetectType5 = ABDetectType.NONE;
                iArr6[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f2818a;
                ABDetectType aBDetectType6 = ABDetectType.NONE;
                iArr7[16] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f2818a;
                ABDetectType aBDetectType7 = ABDetectType.NONE;
                iArr8[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f2818a;
                ABDetectType aBDetectType8 = ABDetectType.NONE;
                iArr9[3] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f2818a;
                ABDetectType aBDetectType9 = ABDetectType.NONE;
                iArr10[15] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public RPMediaPlayManager(Context context, t4 t4Var) {
        this.f2816a = context;
        this.d = t4Var;
    }

    public static /* synthetic */ t4 a(RPMediaPlayManager rPMediaPlayManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t4) ipChange.ipc$dispatch("1f252cdf", new Object[]{rPMediaPlayManager}) : rPMediaPlayManager.d;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        h3 h3Var = this.b;
        if (h3Var != null) {
            h3Var.e();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h3 h3Var = this.b;
        if (h3Var != null) {
            h3Var.a();
            this.b = null;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.removeCallbacks(this.e);
        this.c.postDelayed(this.e, 5000L);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c.removeCallbacks(this.e);
        d();
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new h3(context);
            }
        } catch (Exception unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AudioType {
        BLINK("rp_face_blink"),
        MOUTH("rp_face_open_mouth"),
        POS_PITCH_DOWN("rp_face_pitch_up"),
        POS_PITCH_UP("rp_face_pitch_up"),
        POS_YAW("rp_face_yaw_left_right"),
        DING("rp_face_ding");
        
        public String resourceName;

        AudioType(String str) {
            this.resourceName = str;
        }

        private String getResourceName(String str) {
            if (Locale.getDefault().getLanguage().equals(Locale.CHINA.getLanguage())) {
                return str;
            }
            String language = Locale.getDefault().getLanguage();
            return str + "_" + language;
        }

        public int getRaw(Context context) {
            if (context == null) {
                return 0;
            }
            return context.getResources().getIdentifier(getResourceName(this.resourceName), pg1.ATOM_raw, j.c(context));
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        h3 h3Var = this.b;
        if (h3Var != null) {
            h3Var.a(z);
        }
    }

    public void b(ABDetectType aBDetectType) {
        h3 h3Var;
        AudioType a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e498ed8a", new Object[]{this, aBDetectType});
        } else if (aBDetectType != ABDetectType.AIMLESS && (h3Var = this.b) != null && !h3Var.c() && (a2 = a(aBDetectType)) != null) {
            this.b.c(a2);
        }
    }

    private void a(AudioType audioType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91287515", new Object[]{this, audioType});
            return;
        }
        h3 h3Var = this.b;
        if (h3Var != null) {
            h3Var.c(audioType);
        }
    }

    private AudioType a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioType) ipChange.ipc$dispatch("b56f7e38", new Object[]{this, aBDetectType});
        }
        int ordinal = aBDetectType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 8) {
                            return AudioType.POS_PITCH_UP;
                        }
                        if (ordinal != 9) {
                            switch (ordinal) {
                                case 13:
                                    break;
                                case 14:
                                    break;
                                case 15:
                                    break;
                                case 16:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    }
                    return AudioType.POS_PITCH_DOWN;
                }
                return AudioType.POS_YAW;
            }
            return AudioType.MOUTH;
        }
        return AudioType.BLINK;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(this.f2816a);
        }
    }
}
