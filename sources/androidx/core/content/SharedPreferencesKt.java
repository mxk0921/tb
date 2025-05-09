package androidx.core.content;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", "action", "edit", "(Landroid/content/SharedPreferences;ZLtb/g1a;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SharedPreferencesKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void edit(SharedPreferences sharedPreferences, boolean z, g1a<? super SharedPreferences.Editor, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9d3347", new Object[]{sharedPreferences, new Boolean(z), g1aVar});
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        g1aVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, g1a g1aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f3bbbb", new Object[]{sharedPreferences, new Boolean(z), g1aVar, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        g1aVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
