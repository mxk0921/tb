package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.ob1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00049:;<B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\u000bH\u0007¢\u0006\u0004\b)\u0010\u000fJ\u000f\u0010*\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108¨\u0006="}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "Ltb/xhv;", "updateBackInvokedCallbackState", "(Z)V", "updateEnabledCallbacks", "()V", "Landroidx/activity/BackEventCompat;", "backEvent", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCancelled", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "setOnBackInvokedDispatcher", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "(Landroidx/activity/OnBackPressedCallback;)Landroidx/activity/Cancellable;", "addCancellableCallback", "Landroidx/lifecycle/LifecycleOwner;", "owner", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V", "hasEnabledCallbacks", "()Z", "dispatchOnBackStarted", "dispatchOnBackProgressed", "onBackPressed", "dispatchOnBackCancelled", "Ljava/lang/Runnable;", "Landroidx/core/util/Consumer;", "Ltb/ob1;", "onBackPressedCallbacks", "Ltb/ob1;", "inProgressCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "backInvokedCallbackRegistered", "Z", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class OnBackPressedDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final ob1<OnBackPressedCallback> onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Ltb/xhv;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<BackEventCompat, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcher$1");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(BackEventCompat backEventCompat) {
            invoke2(backEventCompat);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BackEventCompat backEventCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1b03ea7", new Object[]{this, backEventCompat});
                return;
            }
            ckf.g(backEventCompat, "backEvent");
            OnBackPressedDispatcher.access$onBackStarted(OnBackPressedDispatcher.this, backEventCompat);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Ltb/xhv;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass2 extends Lambda implements g1a<BackEventCompat, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2() {
            super(1);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcher$2");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(BackEventCompat backEventCompat) {
            invoke2(backEventCompat);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BackEventCompat backEventCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1b03ea7", new Object[]{this, backEventCompat});
                return;
            }
            ckf.g(backEventCompat, "backEvent");
            OnBackPressedDispatcher.access$onBackProgressed(OnBackPressedDispatcher.this, backEventCompat);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass3 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcher$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                OnBackPressedDispatcher.this.onBackPressed();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass4 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass4() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcher$4");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                OnBackPressedDispatcher.access$onBackCancelled(OnBackPressedDispatcher.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$5  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass5 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass5() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/OnBackPressedDispatcher$5");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                OnBackPressedDispatcher.this.onBackPressed();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "Ltb/xhv;", "registerOnBackInvokedCallback", "(Ljava/lang/Object;ILjava/lang/Object;)V", "unregisterOnBackInvokedCallback", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "createOnBackInvokedCallback", "(Ltb/d1a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(d1a d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e54d216", new Object[]{d1aVar});
                return;
            }
            ckf.g(d1aVar, "$onBackInvoked");
            d1aVar.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnBackInvokedCallback) ipChange.ipc$dispatch("b173ca1c", new Object[]{this, d1aVar});
            }
            ckf.g(d1aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: tb.lpk
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(d1a.this);
                }
            };
        }

        public final void registerOnBackInvokedCallback(Object obj, int i, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fe0fb74", new Object[]{this, obj, new Integer(i), obj2});
                return;
            }
            ckf.g(obj, "dispatcher");
            ckf.g(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3eeee", new Object[]{this, obj, obj2});
                return;
            }
            ckf.g(obj, "dispatcher");
            ckf.g(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0010\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "Ltb/xhv;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "createOnBackAnimationCallback", "(Ltb/g1a;Ltb/g1a;Ltb/d1a;Ltb/d1a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final g1a<? super BackEventCompat, xhv> g1aVar, final g1a<? super BackEventCompat, xhv> g1aVar2, final d1a<xhv> d1aVar, final d1a<xhv> d1aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnBackInvokedCallback) ipChange.ipc$dispatch("4f274ef1", new Object[]{this, g1aVar, g1aVar2, d1aVar, d1aVar2});
            }
            ckf.g(g1aVar, "onBackStarted");
            ckf.g(g1aVar2, "onBackProgressed");
            ckf.g(d1aVar, "onBackInvoked");
            ckf.g(d1aVar2, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onBackCancelled() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d830392", new Object[]{this});
                    } else {
                        d1aVar2.invoke();
                    }
                }

                public void onBackInvoked() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b6f9262d", new Object[]{this});
                    } else {
                        d1aVar.invoke();
                    }
                }

                public void onBackProgressed(BackEvent backEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("94e8d334", new Object[]{this, backEvent});
                        return;
                    }
                    ckf.g(backEvent, "backEvent");
                    g1aVar2.invoke(new BackEventCompat(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4ead141d", new Object[]{this, backEvent});
                        return;
                    }
                    ckf.g(backEvent, "backEvent");
                    g1aVar.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ltb/xhv;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "Landroidx/lifecycle/Lifecycle;", "Landroidx/activity/OnBackPressedCallback;", "currentCancellable", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        public final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            ckf.g(lifecycle, "lifecycle");
            ckf.g(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                return;
            }
            ckf.g(lifecycleOwner, "source");
            ckf.g(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
            } else if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "Ltb/xhv;", "cancel", "()V", "Landroidx/activity/OnBackPressedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class OnBackPressedCancellable implements Cancellable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final OnBackPressedCallback onBackPressedCallback;
        public final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            ckf.g(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            OnBackPressedDispatcher.access$getOnBackPressedCallbacks$p(this.this$0).remove(this.onBackPressedCallback);
            if (ckf.b(OnBackPressedDispatcher.access$getInProgressCallback$p(this.this$0), this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                OnBackPressedDispatcher.access$setInProgressCallback$p(this.this$0, null);
            }
            this.onBackPressedCallback.removeCancellable(this);
            d1a<xhv> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    public static final /* synthetic */ OnBackPressedCallback access$getInProgressCallback$p(OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnBackPressedCallback) ipChange.ipc$dispatch("e9f3efe2", new Object[]{onBackPressedDispatcher});
        }
        return onBackPressedDispatcher.inProgressCallback;
    }

    public static final /* synthetic */ ob1 access$getOnBackPressedCallbacks$p(OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ob1) ipChange.ipc$dispatch("d3c8bb1f", new Object[]{onBackPressedDispatcher});
        }
        return onBackPressedDispatcher.onBackPressedCallbacks;
    }

    public static final /* synthetic */ void access$onBackCancelled(OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecac66", new Object[]{onBackPressedDispatcher});
        } else {
            onBackPressedDispatcher.onBackCancelled();
        }
    }

    public static final /* synthetic */ void access$onBackProgressed(OnBackPressedDispatcher onBackPressedDispatcher, BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50327a7", new Object[]{onBackPressedDispatcher, backEventCompat});
        } else {
            onBackPressedDispatcher.onBackProgressed(backEventCompat);
        }
    }

    public static final /* synthetic */ void access$onBackStarted(OnBackPressedDispatcher onBackPressedDispatcher, BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa7ef90", new Object[]{onBackPressedDispatcher, backEventCompat});
        } else {
            onBackPressedDispatcher.onBackStarted(backEventCompat);
        }
    }

    public static final /* synthetic */ void access$setInProgressCallback$p(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e1ca8e", new Object[]{onBackPressedDispatcher, onBackPressedCallback});
        } else {
            onBackPressedDispatcher.inProgressCallback = onBackPressedCallback;
        }
    }

    public static final /* synthetic */ void access$updateEnabledCallbacks(OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2770e99b", new Object[]{onBackPressedDispatcher});
        } else {
            onBackPressedDispatcher.updateEnabledCallbacks();
        }
    }

    private final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d830392", new Object[]{this});
            return;
        }
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ob1<OnBackPressedCallback> ob1Var = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = ob1Var.listIterator(ob1Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                }
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackCancelled();
        }
    }

    private final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44904e4d", new Object[]{this, backEventCompat});
            return;
        }
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ob1<OnBackPressedCallback> ob1Var = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = ob1Var.listIterator(ob1Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                }
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackProgressed(backEventCompat);
        }
    }

    private final void onBackStarted(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6c0384", new Object[]{this, backEventCompat});
            return;
        }
        ob1<OnBackPressedCallback> ob1Var = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = ob1Var.listIterator(ob1Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallback = null;
                break;
            }
            onBackPressedCallback = listIterator.previous();
            if (onBackPressedCallback.isEnabled()) {
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (this.inProgressCallback != null) {
            onBackCancelled();
        }
        this.inProgressCallback = onBackPressedCallback2;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackStarted(backEventCompat);
        }
    }

    private final void updateBackInvokedCallbackState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa1cffd", new Object[]{this, new Boolean(z)});
            return;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = true;
            } else if (!z && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    private final void updateEnabledCallbacks() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04c3afd", new Object[]{this});
            return;
        }
        boolean z2 = this.hasEnabledCallbacks;
        ob1<OnBackPressedCallback> ob1Var = this.onBackPressedCallbacks;
        if (!(ob1Var instanceof Collection) || !ob1Var.isEmpty()) {
            Iterator<OnBackPressedCallback> it = ob1Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().isEnabled()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z;
        if (z != z2) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z);
            }
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317a446d", new Object[]{this, onBackPressedCallback});
            return;
        }
        ckf.g(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancellable) ipChange.ipc$dispatch("2a07a047", new Object[]{this, onBackPressedCallback});
        }
        ckf.g(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void dispatchOnBackCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aaf30b8", new Object[]{this});
        } else {
            onBackCancelled();
        }
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d36073", new Object[]{this, backEventCompat});
            return;
        }
        ckf.g(backEventCompat, "backEvent");
        onBackProgressed(backEventCompat);
    }

    public final void dispatchOnBackStarted(BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf0931e", new Object[]{this, backEventCompat});
            return;
        }
        ckf.g(backEventCompat, "backEvent");
        onBackStarted(backEventCompat);
    }

    public final boolean hasEnabledCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e078252", new Object[]{this})).booleanValue();
        }
        return this.hasEnabledCallbacks;
    }

    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ob1<OnBackPressedCallback> ob1Var = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = ob1Var.listIterator(ob1Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = null;
                    break;
                }
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e59f4d3", new Object[]{this, onBackInvokedDispatcher});
            return;
        }
        ckf.g(onBackInvokedDispatcher, "invoker");
        this.invokedDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new ob1<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4());
            } else {
                onBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new AnonymousClass5());
            }
            this.onBackInvokedCallback = onBackInvokedCallback;
        }
    }

    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78bf93a", new Object[]{this, lifecycleOwner, onBackPressedCallback});
            return;
        }
        ckf.g(lifecycleOwner, "owner");
        ckf.g(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
            updateEnabledCallbacks();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
