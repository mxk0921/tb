package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$onBackPressedDispatcher$2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/OnBackPressedDispatcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements d1a<OnBackPressedDispatcher> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e3189", new Object[]{componentActivity});
            return;
        }
        ckf.g(componentActivity, "this$0");
        try {
            ComponentActivity.access$onBackPressed$s1027565324(componentActivity);
        } catch (IllegalStateException e) {
            if (!ckf.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!ckf.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dd9c27", new Object[]{componentActivity, onBackPressedDispatcher});
            return;
        }
        ckf.g(componentActivity, "this$0");
        ckf.g(onBackPressedDispatcher, "$dispatcher");
        ComponentActivity.access$addObserverForBackInvoker(componentActivity, onBackPressedDispatcher);
    }

    public static /* synthetic */ Object ipc$super(ComponentActivity$onBackPressedDispatcher$2 componentActivity$onBackPressedDispatcher$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ComponentActivity$onBackPressedDispatcher$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final OnBackPressedDispatcher invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnBackPressedDispatcher) ipChange.ipc$dispatch("bcf4d827", new Object[]{this});
        }
        final ComponentActivity componentActivity = this.this$0;
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: tb.ya4
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(ComponentActivity.this);
            }
        });
        final ComponentActivity componentActivity2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.za4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$2$lambda$1(ComponentActivity.this, onBackPressedDispatcher);
                    }
                });
            } else {
                ComponentActivity.access$addObserverForBackInvoker(componentActivity2, onBackPressedDispatcher);
            }
        }
        return onBackPressedDispatcher;
    }
}
