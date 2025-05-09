package tb;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aoj implements yyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267917);
        t2o.a(503316594);
    }

    @Override // tb.yyc
    public Uri a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2d74944", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        }
        return ufs.x(uri, z, z2);
    }

    @Override // tb.yyc
    public boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c3ec49", new Object[]{this, uri})).booleanValue();
        }
        return ufs.s(uri);
    }

    @Override // tb.yyc
    public Pair<Uri, Boolean> c(Context context, Uri uri, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a91b0649", new Object[]{this, context, uri, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        return ufs.i(context, uri, z, z2, z3);
    }

    @Override // tb.yyc
    public boolean d(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3ab839c", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            str = "";
        } else {
            str = uri.toString();
        }
        if (str.contains("/app/tb-source-app/video-fullpage/pages/index2") || str.contains("/video-fullpage/transparent-videolist.html")) {
            return true;
        }
        return false;
    }
}
