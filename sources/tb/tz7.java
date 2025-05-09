package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tz7 extends mnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267905);
    }

    public static /* synthetic */ Object ipc$super(tz7 tz7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/DressUpNavHooker");
    }

    public final boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c09593", new Object[]{this, uri})).booleanValue();
        }
        return TextUtils.equals(uri.getQueryParameter("renderType"), "native");
    }

    @Override // tb.mnj
    public boolean a(zmj zmjVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24773bcd", new Object[]{this, zmjVar, intent})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            if (data.toString().startsWith("https://infinite.m.taobao.com/app/newdetail/superflow/fashion") && b(data)) {
                intent.setData(mnv.Companion.f(intent.getData(), "https://h5.m.taobao.com/dressup/feeds/index.htm"));
                ynj.i(zmjVar, intent);
                return true;
            } else if (TextUtils.equals(data.getPath(), "/tnode/index.htm") && data.getQueryParameter("tnode") != null && data.getQueryParameter("tnode").startsWith("page_content") && data.getQueryParameter("landingType") != null && b(data)) {
                intent.setData(mnv.Companion.f(intent.getData(), "https://h5.m.taobao.com/dressup/detail/index.htm"));
                ynj.i(zmjVar, intent);
                return true;
            }
        }
        return false;
    }
}
