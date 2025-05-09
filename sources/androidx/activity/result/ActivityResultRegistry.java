package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.a07;
import tb.acp;
import tb.ckf;
import tb.kqu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\b&\u0018\u0000 B2\u00020\u0001:\u0003CBDB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00101\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000209058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\"\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010@\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "callbackAndContract", "Ltb/xhv;", "doDispatch", "(Ljava/lang/String;ILandroid/content/Intent;Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;)V", "registerKey", "(Ljava/lang/String;)V", "generateRandomNumber", "()I", LogContext.RELEASETYPE_RC, "bindRcKey", "(ILjava/lang/String;)V", TLogTracker.LEVEL_INFO, "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "unregister$activity_release", MiPushClient.COMMAND_UNREGISTER, "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onRestoreInstanceState", "", "dispatchResult", "(IILandroid/content/Intent;)Z", "result", "(ILjava/lang/Object;)Z", "", "rcToKey", "Ljava/util/Map;", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "keyToLifecycleContainers", "", "launchedKeys", "Ljava/util/List;", "keyToCallback", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "Companion", "CallbackAndContract", "LifecycleContainer", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ActivityResultRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final Map<Integer, String> rcToKey = new LinkedHashMap();
    private final Map<String, Integer> keyToRc = new LinkedHashMap();
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();
    private final List<String> launchedKeys = new ArrayList();
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();
    private final Bundle pendingResults = new Bundle();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "callback", "Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CallbackAndContract<O> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ActivityResultCallback<O> callback;
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            ckf.g(activityResultCallback, "callback");
            ckf.g(activityResultContract, "contract");
            this.callback = activityResultCallback;
            this.contract = activityResultContract;
        }

        public final ActivityResultCallback<O> getCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityResultCallback) ipChange.ipc$dispatch("4879696a", new Object[]{this});
            }
            return this.callback;
        }

        public final ActivityResultContract<?, O> getContract() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityResultContract) ipChange.ipc$dispatch("9429753", new Object[]{this});
            }
            return this.contract;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "()V", "INITIAL_REQUEST_CODE_VALUE", "", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, "", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Ltb/xhv;", "addObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "clearObservers", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "observers", "Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class LifecycleContainer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Lifecycle lifecycle;
        private final List<LifecycleEventObserver> observers = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            ckf.g(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
        }

        public final void addObserver(LifecycleEventObserver lifecycleEventObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e154672", new Object[]{this, lifecycleEventObserver});
                return;
            }
            ckf.g(lifecycleEventObserver, "observer");
            this.lifecycle.addObserver(lifecycleEventObserver);
            this.observers.add(lifecycleEventObserver);
        }

        public final void clearObservers() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb9f517", new Object[]{this});
                return;
            }
            for (LifecycleEventObserver lifecycleEventObserver : this.observers) {
                this.lifecycle.removeObserver(lifecycleEventObserver);
            }
            this.observers.clear();
        }

        public final Lifecycle getLifecycle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Lifecycle) ipChange.ipc$dispatch("a130f2cb", new Object[]{this});
            }
            return this.lifecycle;
        }
    }

    public static final /* synthetic */ Map access$getKeyToRc$p(ActivityResultRegistry activityResultRegistry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ff0c870d", new Object[]{activityResultRegistry});
        }
        return activityResultRegistry.keyToRc;
    }

    public static final /* synthetic */ List access$getLaunchedKeys$p(ActivityResultRegistry activityResultRegistry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69fa86f6", new Object[]{activityResultRegistry});
        }
        return activityResultRegistry.launchedKeys;
    }

    private final void bindRcKey(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e377bad5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.rcToKey.put(Integer.valueOf(i), str);
        this.keyToRc.put(str, Integer.valueOf(i));
    }

    private final <O> void doDispatch(String str, int i, Intent intent, CallbackAndContract<O> callbackAndContract) {
        ActivityResultCallback<O> activityResultCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2225d876", new Object[]{this, str, new Integer(i), intent, callbackAndContract});
            return;
        }
        if (callbackAndContract != null) {
            activityResultCallback = callbackAndContract.getCallback();
        } else {
            activityResultCallback = null;
        }
        if (activityResultCallback == null || !this.launchedKeys.contains(str)) {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i, intent));
        this.launchedKeys.remove(str);
    }

    private final int generateRandomNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8de4bfb", new Object[]{this})).intValue();
        }
        for (Number number : acp.g(ActivityResultRegistry$generateRandomNumber$1.INSTANCE)) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47154b1", new Object[]{activityResultRegistry, str, activityResultCallback, activityResultContract, lifecycleOwner, event});
            return;
        }
        ckf.g(activityResultRegistry, "this$0");
        ckf.g(str, "$key");
        ckf.g(activityResultCallback, "$callback");
        ckf.g(activityResultContract, "$contract");
        ckf.g(lifecycleOwner, "<anonymous parameter 0>");
        ckf.g(event, "event");
        if (Lifecycle.Event.ON_START == event) {
            activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
            if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
                Object obj = activityResultRegistry.parsedPendingResults.get(str);
                activityResultRegistry.parsedPendingResults.remove(str);
                activityResultCallback.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
            if (activityResult != null) {
                activityResultRegistry.pendingResults.remove(str);
                activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
            }
        } else if (Lifecycle.Event.ON_STOP == event) {
            activityResultRegistry.keyToCallback.remove(str);
        } else if (Lifecycle.Event.ON_DESTROY == event) {
            activityResultRegistry.unregister$activity_release(str);
        }
    }

    private final void registerKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a204164d", new Object[]{this, str});
        } else if (this.keyToRc.get(str) == null) {
            bindRcKey(generateRandomNumber(), str);
        }
    }

    public final boolean dispatchResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fed89cdf", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        String str = this.rcToKey.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        doDispatch(str, i2, intent, this.keyToCallback.get(str));
        return true;
    }

    public abstract <I, O> void onLaunch(int i, ActivityResultContract<I, O> activityResultContract, I i2, ActivityOptionsCompat activityOptionsCompat);

    public final void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    public final <I, O> ActivityResultLauncher<I> register(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> activityResultContract, final ActivityResultCallback<O> activityResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("d63280", new Object[]{this, str, lifecycleOwner, activityResultContract, activityResultCallback});
        }
        ckf.g(str, "key");
        ckf.g(lifecycleOwner, "lifecycleOwner");
        ckf.g(activityResultContract, "contract");
        ckf.g(activityResultCallback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            registerKey(str);
            LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: tb.ic0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ActivityResultRegistry.register$lambda$1(ActivityResultRegistry.this, str, activityResultCallback, activityResultContract, lifecycleOwner2, event);
                }
            });
            this.keyToLifecycleContainers.put(str, lifecycleContainer);
            return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ActivityResultRegistry$register$2 activityResultRegistry$register$2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultRegistry$register$2");
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public ActivityResultContract<I, ?> getContract() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ActivityResultContract) ipChange2.ipc$dispatch("9429753", new Object[]{this});
                    }
                    return activityResultContract;
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void launch(I i, ActivityOptionsCompat activityOptionsCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eebafcf2", new Object[]{this, i, activityOptionsCompat});
                        return;
                    }
                    Object obj = ActivityResultRegistry.access$getKeyToRc$p(ActivityResultRegistry.this).get(str);
                    Object obj2 = activityResultContract;
                    if (obj != null) {
                        int intValue = ((Number) obj).intValue();
                        ActivityResultRegistry.access$getLaunchedKeys$p(ActivityResultRegistry.this).add(str);
                        try {
                            ActivityResultRegistry.this.onLaunch(intValue, activityResultContract, i, activityOptionsCompat);
                        } catch (Exception e) {
                            ActivityResultRegistry.access$getLaunchedKeys$p(ActivityResultRegistry.this).remove(str);
                            throw e;
                        }
                    } else {
                        throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                    }
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void unregister() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50cd9ac3", new Object[]{this});
                    } else {
                        ActivityResultRegistry.this.unregister$activity_release(str);
                    }
                }
            };
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void unregister$activity_release(String str) {
        Integer remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d655d790", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        if (!this.launchedKeys.contains(str) && (remove = this.keyToRc.remove(str)) != null) {
            this.rcToKey.remove(remove);
        }
        this.keyToCallback.remove(str);
        if (this.parsedPendingResults.containsKey(str)) {
            StringBuilder sb = new StringBuilder("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.parsedPendingResults.get(str));
            this.parsedPendingResults.remove(str);
        }
        if (this.pendingResults.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append((ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class));
            this.pendingResults.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(str);
        }
    }

    public final <O> boolean dispatchResult(int i, O o) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f41ad25", new Object[]{this, new Integer(i), o})).booleanValue();
        }
        String str = this.rcToKey.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o);
        } else {
            ActivityResultCallback<?> callback = callbackAndContract.getCallback();
            ckf.e(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
            if (this.launchedKeys.remove(str)) {
                callback.onActivityResult(o);
            }
        }
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        } else if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
            if (!(stringArrayList == null || integerArrayList == null)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
                if (stringArrayList2 != null) {
                    this.launchedKeys.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
                if (bundle2 != null) {
                    this.pendingResults.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    if (this.keyToRc.containsKey(str)) {
                        Integer remove = this.keyToRc.remove(str);
                        if (!this.pendingResults.containsKey(str)) {
                            kqu.d(this.rcToKey).remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i);
                    ckf.f(num, "rcs[i]");
                    int intValue = num.intValue();
                    String str2 = stringArrayList.get(i);
                    ckf.f(str2, "keys[i]");
                    bindRcKey(intValue, str2);
                }
            }
        }
    }

    public final <I, O> ActivityResultLauncher<I> register(final String str, final ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("11cfd605", new Object[]{this, str, activityResultContract, activityResultCallback});
        }
        ckf.g(str, "key");
        ckf.g(activityResultContract, "contract");
        ckf.g(activityResultCallback, "callback");
        registerKey(str);
        this.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.parsedPendingResults.containsKey(str)) {
            Object obj = this.parsedPendingResults.get(str);
            this.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ActivityResultRegistry$register$3 activityResultRegistry$register$3, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in androidx/activity/result/ActivityResultRegistry$register$3");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public ActivityResultContract<I, ?> getContract() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ActivityResultContract) ipChange2.ipc$dispatch("9429753", new Object[]{this});
                }
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i, ActivityOptionsCompat activityOptionsCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eebafcf2", new Object[]{this, i, activityOptionsCompat});
                    return;
                }
                Object obj2 = ActivityResultRegistry.access$getKeyToRc$p(ActivityResultRegistry.this).get(str);
                Object obj3 = activityResultContract;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ActivityResultRegistry.access$getLaunchedKeys$p(ActivityResultRegistry.this).add(str);
                    try {
                        ActivityResultRegistry.this.onLaunch(intValue, activityResultContract, i, activityOptionsCompat);
                    } catch (Exception e) {
                        ActivityResultRegistry.access$getLaunchedKeys$p(ActivityResultRegistry.this).remove(str);
                        throw e;
                    }
                } else {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("50cd9ac3", new Object[]{this});
                } else {
                    ActivityResultRegistry.this.unregister$activity_release(str);
                }
            }
        };
    }
}
