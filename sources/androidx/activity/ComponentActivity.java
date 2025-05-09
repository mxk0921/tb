package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.WXModule;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import tb.a07;
import tb.ckf;
import tb.m09;
import tb.njg;
import tb.r8u;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 à\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\ná\u0001à\u0001â\u0001ã\u0001ä\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020 H\u0015¢\u0006\u0004\b%\u0010#J\u000f\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b)\u0010(J\u0019\u0010+\u001a\u00020\u00172\b\b\u0001\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0016J\u0019\u0010+\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b+\u0010.J#\u0010+\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b+\u00101J#\u00102\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0017H\u0017¢\u0006\u0004\b3\u0010\u0013J\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u00172\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00172\u0006\u00108\u001a\u000207¢\u0006\u0004\b;\u0010:J)\u0010@\u001a\u00020?2\u0006\u0010<\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020?2\u0006\u0010<\u001a\u00020\u00142\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020?2\u0006\u0010<\u001a\u00020\u00142\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00142\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00172\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010L\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u0010N\u001a\u00020\u0003H\u0016¢\u0006\u0004\bL\u0010OJ'\u0010L\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020PH\u0017¢\u0006\u0004\bL\u0010RJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bS\u0010MJ\u000f\u0010T\u001a\u00020\u0017H\u0016¢\u0006\u0004\bT\u0010\u0013J\u000f\u0010U\u001a\u00020\u0017H\u0017¢\u0006\u0004\bU\u0010\u0013J\u001f\u0010Y\u001a\u00020\u00172\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u0014H\u0017¢\u0006\u0004\bY\u0010ZJ)\u0010Y\u001a\u00020\u00172\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u00142\b\u0010[\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\bY\u0010\\JA\u0010b\u001a\u00020\u00172\u0006\u0010W\u001a\u00020]2\u0006\u0010X\u001a\u00020\u00142\b\u0010^\u001a\u0004\u0018\u00010V2\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u0014H\u0017¢\u0006\u0004\bb\u0010cJK\u0010b\u001a\u00020\u00172\u0006\u0010W\u001a\u00020]2\u0006\u0010X\u001a\u00020\u00142\b\u0010^\u001a\u0004\u0018\u00010V2\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u00142\b\u0010[\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\bb\u0010dJ)\u0010g\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00142\u0006\u0010e\u001a\u00020\u00142\b\u0010f\u001a\u0004\u0018\u00010VH\u0015¢\u0006\u0004\bg\u0010hJ-\u0010n\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00142\f\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJI\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000x\"\u0004\b\u0000\u0010p\"\u0004\b\u0001\u0010q2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010r2\u0006\u0010u\u001a\u00020t2\f\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00010v¢\u0006\u0004\by\u0010zJA\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000x\"\u0004\b\u0000\u0010p\"\u0004\b\u0001\u0010q2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010r2\f\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00010v¢\u0006\u0004\by\u0010{J\u0017\u0010~\u001a\u00020\u00172\u0006\u0010}\u001a\u00020|H\u0017¢\u0006\u0004\b~\u0010\u007fJ\u001f\u0010\u0081\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020|0\u0080\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001f\u0010\u0083\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020|0\u0080\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b\u0085\u0001\u0010\u0016J\u001f\u0010\u0086\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020\u00140\u0080\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001J\u001f\u0010\u0087\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020\u00140\u0080\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0082\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u00172\u0006\u0010W\u001a\u00020VH\u0015¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001f\u0010\u008a\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020V0\u0080\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u0082\u0001J\u001f\u0010\u008b\u0001\u001a\u00020\u00172\r\u00108\u001a\t\u0012\u0004\u0012\u00020V0\u0080\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u0082\u0001J\u001b\u0010\u008d\u0001\u001a\u00020\u00172\u0007\u0010\u008c\u0001\u001a\u00020?H\u0017¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J#\u0010\u008d\u0001\u001a\u00020\u00172\u0007\u0010\u008c\u0001\u001a\u00020?2\u0006\u0010}\u001a\u00020|H\u0017¢\u0006\u0006\b\u008d\u0001\u0010\u008f\u0001J \u0010\u0091\u0001\u001a\u00020\u00172\u000e\u00108\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0080\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0082\u0001J \u0010\u0092\u0001\u001a\u00020\u00172\u000e\u00108\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0080\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0082\u0001J\u001b\u0010\u0094\u0001\u001a\u00020\u00172\u0007\u0010\u0093\u0001\u001a\u00020?H\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u008e\u0001J#\u0010\u0094\u0001\u001a\u00020\u00172\u0007\u0010\u0093\u0001\u001a\u00020?2\u0006\u0010}\u001a\u00020|H\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u008f\u0001J \u0010\u0096\u0001\u001a\u00020\u00172\u000e\u00108\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0080\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0082\u0001J \u0010\u0097\u0001\u001a\u00020\u00172\u000e\u00108\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0080\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0082\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0017H\u0015¢\u0006\u0005\b\u0098\u0001\u0010\u0013J\u0019\u0010\u009a\u0001\u001a\u00020\u00172\u0007\u00108\u001a\u00030\u0099\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0019\u0010\u009c\u0001\u001a\u00020\u00172\u0007\u00108\u001a\u00030\u0099\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u009d\u0001\u0010\u0013R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¥\u0001\u0010¦\u0001\u0012\u0005\b§\u0001\u0010\u0013R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010«\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030\u00ad\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010pR\u0018\u0010´\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010¶\u0001\u001a\u00020t8\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020|0\u0080\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00140\u0080\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¼\u0001R%\u0010¾\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u0080\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¼\u0001R&\u0010¿\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0090\u00010\u0080\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¼\u0001R&\u0010À\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0095\u00010\u0080\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010¼\u0001R\u001f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010¼\u0001R\u0019\u0010Â\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R!\u0010É\u0001\u001a\u00030Å\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010¯\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R'\u0010Î\u0001\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÊ\u0001\u0010¯\u0001\u0012\u0005\bÍ\u0001\u0010\u0013\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010&8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010(R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010×\u0001\u001a\u00030¨\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010Û\u0001\u001a\u00030Ø\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0015\u0010ß\u0001\u001a\u00030Ü\u00018F¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006å\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Ltb/xhv;", "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", DataReceiveMonitor.CB_LISTENER, "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", WXModule.GRANT_RESULTS, "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", TLogTracker.LEVEL_INFO, "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", m09.TASK_TYPE_LEVEL, "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Ltb/njg;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "Api33Impl", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final Companion Companion = new Companion(null);
    private ViewModelStore _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final ContextAwareHelper contextAwareHelper;
    private final njg defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final njg fullyDrawnReporter$delegate;
    private final MenuHostHelper menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final njg onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final SavedStateRegistryController savedStateRegistryController;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$Api33Impl;", "", "()V", "getOnBackInvokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "activity", "Landroid/app/Activity;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnBackInvokedDispatcher) ipChange.ipc$dispatch("b9dfab67", new Object[]{this, activity});
            }
            ckf.g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            ckf.f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "()V", "ACTIVITY_RESULT_TAG", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "()V", "custom", "getCustom", "()Ljava/lang/Object;", "setCustom", "(Ljava/lang/Object;)V", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class NonConfigurationInstances {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object custom;
        private ViewModelStore viewModelStore;

        public final Object getCustom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("52a17984", new Object[]{this});
            }
            return this.custom;
        }

        public final ViewModelStore getViewModelStore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewModelStore) ipChange.ipc$dispatch("b3fdec63", new Object[]{this});
            }
            return this.viewModelStore;
        }

        public final void setCustom(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b94f3ad6", new Object[]{this, obj});
            } else {
                this.custom = obj;
            }
        }

        public final void setViewModelStore(ViewModelStore viewModelStore) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f53e1873", new Object[]{this, viewModelStore});
            } else {
                this.viewModelStore = viewModelStore;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "Ltb/xhv;", "viewCreated", "(Landroid/view/View;)V", "activityDestroyed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(View view);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", "Ltb/xhv;", "viewCreated", "(Landroid/view/View;)V", "activityDestroyed", "()V", "runnable", xpc.RECORD_EXECUTE, "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "endWatchTimeMillis", "J", "getEndWatchTimeMillis", "()J", "currentRunnable", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "", "onDrawScheduled", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c4e46df", new Object[]{reportFullyDrawnExecutorImpl});
                return;
            }
            ckf.g(reportFullyDrawnExecutorImpl, "this$0");
            Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
            if (runnable != null) {
                ckf.d(runnable);
                runnable.run();
                reportFullyDrawnExecutorImpl.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12bb5351", new Object[]{this});
                return;
            }
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            ckf.g(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            ckf.f(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: tb.va4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(ComponentActivity.ReportFullyDrawnExecutorImpl.this);
                    }
                });
            } else if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final Runnable getCurrentRunnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("e55e402d", new Object[]{this});
            }
            return this.currentRunnable;
        }

        public final long getEndWatchTimeMillis() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2875f338", new Object[]{this})).longValue();
            }
            return this.endWatchTimeMillis;
        }

        public final boolean getOnDrawScheduled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("79d5807f", new Object[]{this})).booleanValue();
            }
            return this.onDrawScheduled;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73be92ca", new Object[]{this});
                return;
            }
            Runnable runnable = this.currentRunnable;
            if (runnable != null) {
                runnable.run();
                this.currentRunnable = null;
                if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
            }
        }

        public final void setCurrentRunnable(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a52079", new Object[]{this, runnable});
            } else {
                this.currentRunnable = runnable;
            }
        }

        public final void setOnDrawScheduled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b2e70c5", new Object[]{this, new Boolean(z)});
            } else {
                this.onDrawScheduled = z;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10e15508", new Object[]{this, view});
                return;
            }
            ckf.g(view, "view");
            if (!this.onDrawScheduled) {
                this.onDrawScheduled = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new Runnable() { // from class: tb.pa4
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.menuHostHelper$lambda$0(ComponentActivity.this);
            }
        });
        SavedStateRegistryController create = SavedStateRegistryController.Companion.create(this);
        this.savedStateRegistryController = create;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = a.b(new ComponentActivity$fullyDrawnReporter$2(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ComponentActivity$activityResultRegistry$1(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tb.qa4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity._init_$lambda$2(ComponentActivity.this, lifecycleOwner, event);
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tb.ra4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity._init_$lambda$3(ComponentActivity.this, lifecycleOwner, event);
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                        return;
                    }
                    ckf.g(lifecycleOwner, "source");
                    ckf.g(event, "event");
                    ComponentActivity.access$ensureViewModelStore(ComponentActivity.this);
                    ComponentActivity.this.getLifecycle().removeObserver(this);
                }
            });
            create.performAttach();
            SavedStateHandleSupport.enableSavedStateHandles(this);
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().addObserver(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: tb.sa4
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle _init_$lambda$4;
                    _init_$lambda$4 = ComponentActivity._init_$lambda$4(ComponentActivity.this);
                    return _init_$lambda$4;
                }
            });
            addOnContextAvailableListener(new OnContextAvailableListener() { // from class: tb.ta4
                @Override // androidx.activity.contextaware.OnContextAvailableListener
                public final void onContextAvailable(Context context) {
                    ComponentActivity._init_$lambda$5(ComponentActivity.this, context);
                }
            });
            this.defaultViewModelProviderFactory$delegate = a.b(new ComponentActivity$defaultViewModelProviderFactory$2(this));
            this.onBackPressedDispatcher$delegate = a.b(new ComponentActivity$onBackPressedDispatcher$2(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777bd788", new Object[]{componentActivity, lifecycleOwner, event});
            return;
        }
        ckf.g(componentActivity, "this$0");
        ckf.g(lifecycleOwner, "<anonymous parameter 0>");
        ckf.g(event, "event");
        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af4e989", new Object[]{componentActivity, lifecycleOwner, event});
            return;
        }
        ckf.g(componentActivity, "this$0");
        ckf.g(lifecycleOwner, "<anonymous parameter 0>");
        ckf.g(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.clearAvailableContext();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("206cbb61", new Object[]{componentActivity});
        }
        ckf.g(componentActivity, "this$0");
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef186e4c", new Object[]{componentActivity, context});
            return;
        }
        ckf.g(componentActivity, "this$0");
        ckf.g(context, AdvanceSetting.NETWORK_TYPE);
        Bundle consumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (consumeRestoredStateForKey != null) {
            componentActivity.activityResultRegistry.onRestoreInstanceState(consumeRestoredStateForKey);
        }
    }

    public static final /* synthetic */ void access$addObserverForBackInvoker(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36bff351", new Object[]{componentActivity, onBackPressedDispatcher});
        } else {
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }
    }

    public static final /* synthetic */ void access$ensureViewModelStore(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7192b6d", new Object[]{componentActivity});
        } else {
            componentActivity.ensureViewModelStore();
        }
    }

    public static final /* synthetic */ ReportFullyDrawnExecutor access$getReportFullyDrawnExecutor$p(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportFullyDrawnExecutor) ipChange.ipc$dispatch("92acdaad", new Object[]{componentActivity});
        }
        return componentActivity.reportFullyDrawnExecutor;
    }

    public static final /* synthetic */ void access$onBackPressed$s1027565324(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0e2e18", new Object[]{componentActivity});
        } else {
            super.onBackPressed();
        }
    }

    private final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84d8f0", new Object[]{this, onBackPressedDispatcher});
        } else {
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tb.ua4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity.addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher.this, this, lifecycleOwner, event);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4962ac", new Object[]{onBackPressedDispatcher, componentActivity, lifecycleOwner, event});
            return;
        }
        ckf.g(onBackPressedDispatcher, "$dispatcher");
        ckf.g(componentActivity, "this$0");
        ckf.g(lifecycleOwner, "<anonymous parameter 0>");
        ckf.g(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.setOnBackInvokedDispatcher(Api33Impl.INSTANCE.getOnBackInvokedDispatcher(componentActivity));
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportFullyDrawnExecutor) ipChange.ipc$dispatch("f8067ef6", new Object[]{this});
        }
        return new ReportFullyDrawnExecutorImpl();
    }

    private final void ensureViewModelStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc4cea2", new Object[]{this});
        } else if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e50874", new Object[0]);
        }
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97387d20", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(ComponentActivity componentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -2067683862:
                return new Boolean(super.onPreparePanel(((Number) objArr[0]).intValue(), (View) objArr[1], (Menu) objArr[2]));
            case -1630383126:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]);
                return null;
            case -1628464379:
                super.startIntentSenderForResult((IntentSender) objArr[0], ((Number) objArr[1]).intValue(), (Intent) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                return null;
            case -1601511123:
                super.onPanelClosed(((Number) objArr[0]).intValue(), (Menu) objArr[1]);
                return null;
            case -1590627637:
                return super.getLifecycle();
            case -1388205895:
                return new Boolean(super.onMenuItemSelected(((Number) objArr[0]).intValue(), (MenuItem) objArr[1]));
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -801135301:
                super.onUserLeaveHint();
                return null;
            case -730211576:
                return new Boolean(super.onCreatePanelMenu(((Number) objArr[0]).intValue(), (Menu) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -406251089:
                super.startIntentSenderForResult((IntentSender) objArr[0], ((Number) objArr[1]).intValue(), (Intent) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), (Bundle) objArr[6]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 902425770:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 968107227:
                super.reportFullyDrawn();
                return null;
            case 1123068698:
                super.onPictureInPictureModeChanged(((Boolean) objArr[0]).booleanValue(), (Configuration) objArr[1]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 1867171439:
                super.addContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 1918621354:
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue(), (Configuration) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/ComponentActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6569be06", new Object[]{componentActivity});
            return;
        }
        ckf.g(componentActivity, "this$0");
        componentActivity.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4ac66f", new Object[]{this, view, layoutParams});
            return;
        }
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c933ad9", new Object[]{this, menuProvider});
            return;
        }
        ckf.g(menuProvider, "provider");
        this.menuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30e618f", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onConfigurationChangedListeners.add(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c378f99", new Object[]{this, onContextAvailableListener});
            return;
        }
        ckf.g(onContextAvailableListener, DataReceiveMonitor.CB_LISTENER);
        this.contextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bf9865", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onMultiWindowModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(Consumer<Intent> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f08cd1", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7994e97", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96eb04a", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onTrimMemoryListeners.add(consumer);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd342a2c", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, DataReceiveMonitor.CB_LISTENER);
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultRegistry) ipChange.ipc$dispatch("dd045016", new Object[]{this});
        }
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CreationExtras) ipChange.ipc$dispatch("9cb4037b", new Object[]{this});
        }
        Bundle bundle = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        if (getApplication() != null) {
            CreationExtras.Key<Application> key = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            ckf.f(application, "application");
            mutableCreationExtras.set(key, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("69487ace", new Object[]{this});
        }
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public FullyDrawnReporter getFullyDrawnReporter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FullyDrawnReporter) ipChange.ipc$dispatch("cd97392c", new Object[]{this});
        }
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ee13aad0", new Object[]{this});
        }
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lifecycle) ipChange.ipc$dispatch("a130f2cb", new Object[]{this});
        }
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnBackPressedDispatcher) ipChange.ipc$dispatch("d447b05c", new Object[]{this});
        }
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateRegistry) ipChange.ipc$dispatch("4bef1e3b", new Object[]{this});
        }
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStore) ipChange.ipc$dispatch("b3fdec63", new Object[]{this});
        }
        if (getApplication() != null) {
            ensureViewModelStore();
            ViewModelStore viewModelStore = this._viewModelStore;
            ckf.d(viewModelStore);
            return viewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9031809a", new Object[]{this});
            return;
        }
        View decorView = getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        ckf.f(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        ckf.f(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        ckf.f(decorView4, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        ckf.f(decorView5, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.set(decorView5, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79ffcc1", new Object[]{this});
        } else {
            invalidateOptionsMenu();
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (!this.activityResultRegistry.dispatchResult(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            getOnBackPressedDispatcher().onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97be6586", new Object[]{this, new Boolean(z)});
        } else if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z));
            }
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08ae12d", new Object[]{this, new Integer(i), menu});
            return;
        }
        ckf.g(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c829a716", new Object[]{this, new Boolean(z)});
        } else if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z));
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        ckf.g(strArr, "permissions");
        ckf.g(iArr, WXModule.GRANT_RESULTS);
        if (!this.activityResultRegistry.dispatchResult(i, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9065318", new Object[]{this});
        }
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1de3009", new Object[]{this});
        }
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.getViewModelStore();
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.setCustom(onRetainCustomNonConfigurationInstance);
        nonConfigurationInstances2.setViewModelStore(viewModelStore);
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            ckf.e(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03fa53b", new Object[]{this});
            return;
        }
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    public Context peekAvailableContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b325d120", new Object[]{this});
        }
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("484c7aaa", new Object[]{this, activityResultContract, activityResultRegistry, activityResultCallback});
        }
        ckf.g(activityResultContract, "contract");
        ckf.g(activityResultRegistry, "registry");
        ckf.g(activityResultCallback, "callback");
        return activityResultRegistry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider menuProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4641e956", new Object[]{this, menuProvider});
            return;
        }
        ckf.g(menuProvider, "provider");
        this.menuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5697714c", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onConfigurationChangedListeners.remove(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7553d16", new Object[]{this, onContextAvailableListener});
            return;
        }
        ckf.g(onContextAvailableListener, DataReceiveMonitor.CB_LISTENER);
        this.contextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6943ace2", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onMultiWindowModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(Consumer<Intent> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d3f134", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facf803a", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f7d847", new Object[]{this, consumer});
            return;
        }
        ckf.g(consumer, DataReceiveMonitor.CB_LISTENER);
        this.onTrimMemoryListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c653e9", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, DataReceiveMonitor.CB_LISTENER);
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b424db", new Object[]{this});
            return;
        }
        try {
            if (r8u.d()) {
                r8u.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
            r8u.b();
        } catch (Throwable th) {
            r8u.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i)});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eef9b05", new Object[]{this, intentSender, new Integer(i), intent, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac196954", new Object[]{this, menuProvider, lifecycleOwner});
            return;
        }
        ckf.g(menuProvider, "provider");
        ckf.g(lifecycleOwner, "owner");
        this.menuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d479db08", new Object[]{this, new Integer(i), menu})).booleanValue();
        }
        ckf.g(menu, "menu");
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c1a5ea", new Object[]{this, new Integer(i), view, menu})).booleanValue();
        }
        ckf.g(menu, "menu");
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.menuHostHelper.onPrepareMenu(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed253ea", new Object[]{this, intent, new Integer(i), bundle});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c919af", new Object[]{this, intentSender, new Integer(i), intent, new Integer(i2), new Integer(i3), new Integer(i4), bundle});
            return;
        }
        ckf.g(intentSender, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d61fb7", new Object[]{this, menuProvider, lifecycleOwner, state});
            return;
        }
        ckf.g(menuProvider, "provider");
        ckf.g(lifecycleOwner, "owner");
        ckf.g(state, "state");
        this.menuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad41a8b9", new Object[]{this, new Integer(i), menuItem})).booleanValue();
        }
        ckf.g(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.onMenuItemSelected(menuItem);
        }
        return false;
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityResultLauncher) ipChange.ipc$dispatch("822def80", new Object[]{this, activityResultContract, activityResultCallback});
        }
        ckf.g(activityResultContract, "contract");
        ckf.g(activityResultCallback, "callback");
        return registerForActivityResult(activityResultContract, this.activityResultRegistry, activityResultCallback);
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f0ab1a", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        ckf.f(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
