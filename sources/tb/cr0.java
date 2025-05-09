package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17253a;
        public boolean b;
        public String c;

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7420836f", new Object[]{this});
            }
            return this.c;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6c412a82", new Object[]{this});
            }
            return this.f17253a;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6ef24f", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac829a34", new Object[]{this, str});
            } else {
                this.f17253a = str;
            }
        }

        public void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee918cea", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("262e9570", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PrivacyEntranceConfig{entranceName='" + this.f17253a + "', shouldDisplayEntrance=" + this.b + ", entranceLinkedUrl='" + this.c + "'}";
        }
    }

    public a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7e438495", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        return rsx.e(context);
    }
}
