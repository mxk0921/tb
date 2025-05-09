package com.taobao.trtc.utils;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gmu;
import tb.nlu;
import tb.rlu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcPhoneStats {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static nlu c;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13975a;
    public Object b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrtcTelephonyCallback extends TelephonyCallback implements TelephonyCallback.CallStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313650);
        }

        private TrtcTelephonyCallback() {
        }

        public static /* synthetic */ Object ipc$super(TrtcTelephonyCallback trtcTelephonyCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/utils/TrtcPhoneStats$TrtcTelephonyCallback");
        }

        public void onCallStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38f74fc", new Object[]{this, new Integer(i)});
            } else {
                TrtcPhoneStats.a(i, "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends PhoneStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313649);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1198008378) {
                super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/utils/TrtcPhoneStats$TrtcPhoneSstatsListener");
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onCallStateChanged(i, str);
            TrtcPhoneStats.a(i, str);
        }
    }

    static {
        t2o.a(395313647);
    }

    public TrtcPhoneStats(Context context, nlu nluVar) {
        this.f13975a = context;
        c = nluVar;
    }

    public static /* synthetic */ void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862f4136", new Object[]{new Integer(i), str});
        } else {
            b(i, str);
        }
    }

    public static void b(int i, String str) {
        nlu nluVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b897d7c6", new Object[]{new Integer(i), str});
        } else if (d.get() && (nluVar = c) != null) {
            if (i == 0) {
                nluVar.E1(110, str);
            } else if (i == 2) {
                nluVar.E1(113, str);
            }
        }
    }

    public void c() {
        Executor mainExecutor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (ContextCompat.checkSelfPermission(this.f13975a, "android.permission.READ_PHONE_STATE") != 0) {
            TrtcLog.j("TrtcPhoneState", "start error, need android.permission.READ_PHONE_STATE");
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) rlu.f27461a.getSystemService("phone");
                if (telephonyManager != null) {
                    if (Build.VERSION.SDK_INT < 31) {
                        b bVar = new b();
                        this.b = bVar;
                        telephonyManager.listen(bVar, 32);
                    } else {
                        this.b = new TrtcTelephonyCallback();
                        mainExecutor = this.f13975a.getMainExecutor();
                        telephonyManager.registerTelephonyCallback(mainExecutor, gmu.a(this.b));
                    }
                    d.set(true);
                    TrtcLog.j("TrtcPhoneState", "start success");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        d.set(false);
        c = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) rlu.f27461a.getSystemService("phone");
            if (telephonyManager != null) {
                if (Build.VERSION.SDK_INT < 31) {
                    telephonyManager.listen((PhoneStateListener) this.b, 0);
                } else {
                    telephonyManager.unregisterTelephonyCallback(gmu.a(this.b));
                }
                TrtcLog.j("TrtcPhoneState", "stop success");
            }
        } catch (Throwable unused) {
        }
    }
}
