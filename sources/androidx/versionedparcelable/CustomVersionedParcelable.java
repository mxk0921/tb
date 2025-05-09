package androidx.versionedparcelable;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class CustomVersionedParcelable implements VersionedParcelable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void onPostParceling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c575661", new Object[]{this});
        }
    }

    public void onPreParceling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2c1cf8", new Object[]{this, new Boolean(z)});
        }
    }
}
