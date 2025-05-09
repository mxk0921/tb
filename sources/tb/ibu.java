package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ibu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ITrackAdapter f21219a = fe7.a();

    @SafeVarargs
    public static void a(Context context, String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b1bc94", new Object[]{context, str, pairArr});
        } else {
            b(context, null, str, pairArr);
        }
    }

    @SafeVarargs
    public static void b(Context context, String str, String str2, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de98c30", new Object[]{context, str, str2, pairArr});
            return;
        }
        ITrackAdapter iTrackAdapter = f21219a;
        if (iTrackAdapter != null) {
            if (context instanceof Activity) {
                iTrackAdapter.ctrlClickedOnPage(context, str, str2, pairArr);
                return;
            }
            throw new IllegalArgumentException("context must be activity");
        }
    }

    public static void c(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e187d40", new Object[]{activity, str, str2, str3});
            return;
        }
        ITrackAdapter iTrackAdapter = f21219a;
        if (iTrackAdapter != null) {
            iTrackAdapter.pageEnter(activity, str, str2, str3);
        }
    }

    public static void d(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497aa095", new Object[]{activity, str, str2});
            return;
        }
        ITrackAdapter iTrackAdapter = f21219a;
        if (iTrackAdapter != null) {
            iTrackAdapter.pageLeave(activity, str, str2);
        }
    }
}
