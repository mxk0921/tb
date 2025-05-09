package tb;

import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nqs extends d9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(848298041);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqs(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
    }

    public static /* synthetic */ Object ipc$super(nqs nqsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/tab/TabEmptyRender");
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
        } else {
            ckf.g(str, "event");
        }
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "TabEmpty";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }
}
