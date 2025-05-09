package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ9\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00028\u0000H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J1\u0010*\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b*\u0010.JS\u00104\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020/2\u0006\u0010)\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010'2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,H\u0017¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010)\u001a\u00020\tH\u0017¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001dH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001dH\u0016¢\u0006\u0004\bD\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0017\u0010P\u001a\u00020O8G¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/FragmentContainer;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "(Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "Ltb/xhv;", "onDump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "onShouldSaveFragmentState", "(Landroidx/fragment/app/Fragment;)Z", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "()Landroid/view/LayoutInflater;", "onGetHost", "()Ljava/lang/Object;", "onSupportInvalidateOptionsMenu", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "requestCode", "onStartActivityFromFragment", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V", "Landroid/os/Bundle;", "options", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "onStartIntentSenderFromFragment", "(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "permissions", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", AttributionReporter.SYSTEM_PERMISSION, "onShouldShowRequestPermissionRationale", "(Ljava/lang/String;)Z", "onHasWindowAnimations", "()Z", "onGetWindowAnimations", "()I", "id", "Landroid/view/View;", "onFindViewById", "(I)Landroid/view/View;", "onHasView", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", TLogTracker.LEVEL_INFO, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Activity activity;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        ckf.g(context, "context");
        ckf.g(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i;
        this.fragmentManager = new FragmentManagerImpl();
    }

    public static /* synthetic */ Object ipc$super(FragmentHostCallback fragmentHostCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentHostCallback");
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.activity;
    }

    public final Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public final FragmentManager getFragmentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("97410a9", new Object[]{this});
        }
        return this.fragmentManager;
    }

    public final Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.handler;
    }

    public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d497044e", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        ckf.g(str, "prefix");
        ckf.g(printWriter, "writer");
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View onFindViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d8f9f4f", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    public abstract H onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("ec35dec5", new Object[]{this});
        }
        LayoutInflater from = LayoutInflater.from(this.context);
        ckf.f(from, "from(context)");
        return from;
    }

    public int onGetWindowAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("397ea10", new Object[]{this})).intValue();
        }
        return this.windowAnimations;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f182a0b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean onHasWindowAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2719a365", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link RequestMultiplePermissions}. This method will still be called when Fragments\n      call the deprecated <code>requestPermissions()</code> method.")
    public void onRequestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c250c4b1", new Object[]{this, fragment, strArr, new Integer(i)});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(strArr, "permissions");
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a191ffd5", new Object[]{this, fragment})).booleanValue();
        }
        ckf.g(fragment, "fragment");
        return true;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6f6e9b", new Object[]{this, fragment, intent, new Integer(i)});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        onStartActivityFromFragment(fragment, intent, i, null);
    }

    @Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link StartIntentSenderForResult}. This method will still be called when Fragments\n      call the deprecated <code>startIntentSenderForResult()</code> method.")
    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d806579c", new Object[]{this, fragment, intentSender, new Integer(i), intent, new Integer(i2), new Integer(i3), new Integer(i4), bundle});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (i == -1) {
            Activity activity = this.activity;
            if (activity != null) {
                ActivityCompat.startIntentSenderForResult(activity, intentSender, i, intent, i2, i3, i4, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void onSupportInvalidateOptionsMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac9559", new Object[]{this});
        }
    }

    public boolean onShouldShowRequestPermissionRationale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5abd335d", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, AttributionReporter.SYSTEM_PERMISSION);
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6e0259", new Object[]{this, fragment, intent, new Integer(i), bundle});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (i == -1) {
            ContextCompat.startActivity(this.context, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
        ckf.g(context, "context");
        ckf.g(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
        ckf.g(fragmentActivity, "activity");
    }
}
