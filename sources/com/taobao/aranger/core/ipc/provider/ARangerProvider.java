package com.taobao.aranger.core.ipc.provider;

import android.app.Application;
import android.content.AttributionSource;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.IContentProvider;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.entity.AttributionSourceState;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a2o;
import tb.b5d;
import tb.g5d;
import tb.gdp;
import tb.h5d;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ARangerProvider extends ContentProvider implements IRemoteService {
    public static final String b;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final Object d;
    public static final Method e;

    /* renamed from: a  reason: collision with root package name */
    public final HookIContentProvider f10062a = new HookIContentProvider();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HookIContentProvider extends Binder implements IContentProvider {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f10064a;

            public a(List list) {
                this.f10064a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    List<String> list = this.f10064a;
                    if (list != null) {
                        ARangerProvider.this.recycle(list);
                    }
                } catch (Exception e) {
                    b5d.h(ARangerProvider.b, "[onTransact][recycle]", e, new Object[0]);
                }
            }
        }

        static {
            t2o.a(393216059);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HookIContentProvider() {
            attachInterface(this, Constants.DEFAULT_CONTENT_DESCRIPTOR);
        }

        public final /* synthetic */ void b(Call call) {
            try {
                ARangerProvider.this.sendCall(call);
            } catch (Exception e) {
                b5d.h(ARangerProvider.b, "[onTransact][sendCall] oneway", e, new Object[0]);
            }
        }

        public Bundle call(String str, String str2, String str3, Bundle bundle) {
            return ARangerProvider.this.call(str2, str3, bundle);
        }

        public Bundle call(String str, String str2, String str3, String str4, Bundle bundle) {
            return ARangerProvider.this.call(str3, str4, bundle);
        }

        public Bundle call(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
            return ARangerProvider.this.call(str4, str5, bundle);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle;
            if (i == 0) {
                boolean z = i2 == 17 || i2 == 1;
                try {
                    final Call createFromParcel = Call.CREATOR.createFromParcel(parcel);
                    if (z) {
                        g5d.b(false, false, new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ARangerProvider.HookIContentProvider.this.b(createFromParcel);
                            }
                        });
                    } else {
                        Reply sendCall = ARangerProvider.this.sendCall(createFromParcel);
                        if (!createFromParcel.getMethodWrapper().isVoid() || sendCall.isError() || sendCall.getFlowParameterWrappers() != null) {
                            sendCall.writeToParcel(parcel2, 0);
                        }
                    }
                } catch (Exception e) {
                    String str = ARangerProvider.b;
                    b5d.h(str, "[onTransact][oneway:" + z + "][sendCall]", e, new Object[0]);
                    if (!z) {
                        Reply.obtain().setErrorCode(10).setErrorMessage(e.getMessage()).writeToParcel(parcel2, i2);
                    }
                }
                return true;
            } else if (i == 1) {
                try {
                    g5d.b(false, false, new a(parcel.createStringArrayList()));
                } catch (Exception e2) {
                    b5d.h(ARangerProvider.b, "[onTransact][recycle] create string array list error", e2, new Object[0]);
                }
                return true;
            } else if (i != 21) {
                return true;
            } else {
                try {
                    parcel.enforceInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        if (ARangerProvider.e != null) {
                            ARangerProvider.e.invoke(ARangerProvider.d, parcel);
                        } else {
                            AttributionSourceState.CREATOR.createFromParcel(parcel);
                        }
                        parcel.readString();
                    } else {
                        parcel.readString();
                        if (i3 == 29) {
                            parcel.readString();
                        }
                        if (i3 == 30) {
                            parcel.readString();
                            parcel.readString();
                        }
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
                    if (readString != null) {
                        bundle = ARangerProvider.this.call(readString, readString2, readBundle);
                    } else {
                        bundle = new Bundle();
                        bundle.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(40).setErrorMessage("read method null from default call parcel."));
                    }
                } catch (Exception e3) {
                    b5d.h(ARangerProvider.b, "[onTransact][callTransaction]", e3, new Object[0]);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(41).setErrorMessage(e3.toString()));
                    bundle = bundle2;
                }
                parcel2.writeNoException();
                parcel2.writeBundle(bundle);
                return true;
            }
        }

        public Bundle call(AttributionSource attributionSource, String str, String str2, String str3, Bundle bundle) {
            return ARangerProvider.this.call(str2, str3, bundle);
        }

        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f10065a;

        public a(List list) {
            this.f10065a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                List<String> list = this.f10065a;
                if (list != null) {
                    ARangerProvider.this.recycle(list);
                }
            } catch (Exception e) {
                b5d.h(ARangerProvider.b, "[call][recycle]", e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setAction(Constants.ACTION_CONNECT);
                intent.putExtra("processName", h5d.f());
                intent.setPackage(re.r().getPackageName());
                re.r().sendBroadcast(intent);
            } catch (Throwable th) {
                b5d.h(ARangerProvider.b, "[connect][sendBroadcast]", th, new Object[0]);
            }
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        str.hashCode();
        if (str.equals("call")) {
            bundle.setClassLoader(re.class.getClassLoader());
            Call call = (Call) bundle.getParcelable("call");
            try {
                Reply sendCall = sendCall(call);
                if (call.getMethodWrapper().isVoid()) {
                    if (!sendCall.isError()) {
                        if (sendCall.getFlowParameterWrappers() != null) {
                        }
                    }
                }
                bundle2.putParcelable(Constants.PARAM_REPLY, sendCall);
            } catch (Exception e2) {
                b5d.h(b, "[call][sendCall]", e2, new Object[0]);
                bundle2.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(10).setErrorMessage(e2.getMessage()));
            }
        } else if (str.equals(Constants.METHOD_RECYCLE_REMOTE)) {
            g5d.b(false, false, new a(bundle.getStringArrayList("keys")));
        }
        return bundle2;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() {
        if (c.compareAndSet(false, true)) {
            g5d.b(false, false, new b());
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public IContentProvider getIContentProvider() {
        return this.f10062a;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        return false;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() != null) {
            re.t((Application) getContext().getApplicationContext());
        }
        connect();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        gdp.b().a(list);
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public Reply sendCall(Call call) {
        try {
            return a2o.a(call).a();
        } catch (Exception e2) {
            b5d.h(b, "[sendCall][handleReply]", e2, new Object[0]);
            if (e2 instanceof IPCException) {
                return Reply.obtain().setErrorCode(((IPCException) e2).getErrorCode()).setErrorMessage(e2.getMessage());
            }
            return Reply.obtain().setErrorCode(11).setErrorMessage(e2.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        t2o.a(393216056);
        t2o.a(393216080);
        String simpleName = ARangerProvider.class.getSimpleName();
        b = simpleName;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                Object obj = StaticHook.m(Class.forName("android.content.AttributionSource"), "CREATOR").get(null);
                d = obj;
                e = obj.getClass().getDeclaredMethod("createFromParcel", Parcel.class);
                b5d.i(simpleName, "over 31, reflect", new Object[0]);
            }
        } catch (Throwable th) {
            b5d.h(b, "static block err", th, new Object[0]);
        }
    }
}
