package tb;

import android.content.Context;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fpj implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (str.hashCode() == 1405084438 && str.equals("setTitle")) {
            return a(kdbVar, map, vqVar);
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.a("api " + str + " not found");
    }

    public final ExecuteResult a(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("2da663d4", new Object[]{this, kdbVar, map, vqVar});
        }
        Context context = kdbVar.l().getContext();
        if (!(context instanceof AppCompatActivity)) {
            return new ErrorResult("500", "env.getContext is invalid.", (Map) null, 4, (a07) null);
        }
        Object obj = map.get("title");
        if (!(obj instanceof String)) {
            ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
            return aVar.g("Invalid param title=" + obj + '.');
        }
        ActionBar supportActionBar = ((AppCompatActivity) context).getSupportActionBar();
        if (supportActionBar == null) {
            return new ErrorResult("500", "no action to be set.", (Map) null, 4, (a07) null);
        }
        supportActionBar.setTitle((CharSequence) obj);
        return new FinishResult(null, null, 3, null);
    }
}
