package com.taobao.avplayer.common;

import android.content.Context;
import android.view.OrientationEventListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWScreenOrientationListenerImp extends OrientationEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f10155a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Orientation {
        PORTRAIT,
        LANDSCAPE_90,
        LANDSCAPE_270;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Orientation orientation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/common/DWScreenOrientationListenerImp$Orientation");
        }

        public static Orientation valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Orientation) ipChange.ipc$dispatch("dc4e2959", new Object[]{str});
            }
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(Orientation orientation);
    }

    static {
        t2o.a(452985024);
    }

    public DWScreenOrientationListenerImp(Context context) {
        super(context);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWScreenOrientationListenerImp);
    }

    public static /* synthetic */ Object ipc$super(DWScreenOrientationListenerImp dWScreenOrientationListenerImp, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/common/DWScreenOrientationListenerImp");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4124d044", new Object[]{this, aVar});
        } else {
            this.f10155a = aVar;
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9b5e39", new Object[]{this, new Integer(i)});
        } else if (i != -1) {
            if (i > 85 && i < 95) {
                a aVar = this.f10155a;
                if (aVar != null) {
                    aVar.a(Orientation.LANDSCAPE_90);
                }
                IpChange ipChange2 = Orientation.$ipChange;
            } else if (i > 265 && i < 275) {
                a aVar2 = this.f10155a;
                if (aVar2 != null) {
                    aVar2.a(Orientation.LANDSCAPE_270);
                }
                IpChange ipChange3 = Orientation.$ipChange;
            } else if (i > 350 || i < 10 || (i > 170 && i < 190)) {
                a aVar3 = this.f10155a;
                if (aVar3 != null) {
                    aVar3.a(Orientation.PORTRAIT);
                }
                IpChange ipChange4 = Orientation.$ipChange;
            }
        }
    }
}
