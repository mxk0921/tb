package com.taobao.login4android.uninstall;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.heytap.mspsdk.keychain.impl.OnResultListener;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.BackgroundExecutor;
import java.lang.reflect.Field;
import java.util.HashMap;
import tb.i7l;
import tb.vao;
import tb.xpt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OppoKeyChain {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SDK_REMOTE_ERROR = -3751;
    private static final String TAG = "login.OppoKeyChain";
    private final Context context;
    private boolean initialized;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.uninstall.OppoKeyChain$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass2 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CommonDataCallback val$callback;
        public final /* synthetic */ HashMap val$query;

        public AnonymousClass2(HashMap hashMap, CommonDataCallback commonDataCallback) {
            this.val$query = hashMap;
            this.val$callback = commonDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem commit");
                i7l.d(OppoKeyChain.access$000(OppoKeyChain.this), this.val$query, new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                    public void onResult(final vao vaoVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b10d285e", new Object[]{this, vaoVar});
                            return;
                        }
                        LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem on result=" + vaoVar);
                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (vaoVar.a() == 0) {
                                    AnonymousClass2.this.val$callback.onSuccess(vaoVar.b());
                                } else {
                                    AnonymousClass2.this.val$callback.onFail(vaoVar.a(), vaoVar.c());
                                }
                            }
                        });
                    }
                });
            } catch (Exception e) {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "queryItem error:Exception=", e);
                CommonDataCallback commonDataCallback = this.val$callback;
                commonDataCallback.onFail(-3754, "call_query_error_" + e.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("code", "-3754");
                hashMap.put("msg", e.getMessage());
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_query_error", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.uninstall.OppoKeyChain$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass3 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CommonDataCallback val$callback;
        public final /* synthetic */ HashMap val$query;

        public AnonymousClass3(HashMap hashMap, CommonDataCallback commonDataCallback) {
            this.val$query = hashMap;
            this.val$callback = commonDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                i7l.e(OppoKeyChain.access$000(OppoKeyChain.this), this.val$query, new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                    public void onResult(final vao vaoVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b10d285e", new Object[]{this, vaoVar});
                        } else {
                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (vaoVar.a() == 0) {
                                        AnonymousClass3.this.val$callback.onSuccess(vaoVar.b());
                                    } else {
                                        AnonymousClass3.this.val$callback.onFail(vaoVar.a(), vaoVar.c());
                                    }
                                }
                            });
                        }
                    }
                });
            } catch (Exception e) {
                LoginTLogAdapter.trace(OppoKeyChain.TAG, "update error,", e);
                CommonDataCallback commonDataCallback = this.val$callback;
                commonDataCallback.onFail(-3753, "call_update_error_" + e.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("code", "-3753");
                hashMap.put("msg", e.getMessage());
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_update_error", hashMap);
            }
        }
    }

    public OppoKeyChain(Context context) {
        this.context = context.getApplicationContext();
    }

    public static /* synthetic */ Context access$000(OppoKeyChain oppoKeyChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c6b46f75", new Object[]{oppoKeyChain});
        }
        return oppoKeyChain.context;
    }

    public void clear(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa9b6d1", new Object[]{this, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "clear is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        i7l.a(OppoKeyChain.access$000(OppoKeyChain.this), new OnResultListener() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.heytap.mspsdk.keychain.impl.OnResultListener
                            public void onResult(vao vaoVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b10d285e", new Object[]{this, vaoVar});
                                } else if (vaoVar.a() == 0) {
                                    commonDataCallback.onSuccess(vaoVar.b());
                                } else {
                                    commonDataCallback.onFail(vaoVar.a(), vaoVar.c());
                                }
                            }
                        });
                    } catch (Exception e) {
                        LoginTLogAdapter.trace(OppoKeyChain.TAG, "clear error,", e);
                        CommonDataCallback commonDataCallback2 = commonDataCallback;
                        commonDataCallback2.onFail(-3752, "call_clear_error_" + e.getMessage());
                        HashMap hashMap = new HashMap();
                        hashMap.put("code", "-3752");
                        hashMap.put("msg", e.getMessage());
                        UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_clear_error", hashMap);
                    }
                }
            });
        }
    }

    public void init() {
        if (isSupport() && !this.initialized) {
            try {
                Field declaredField = xpt.class.getDeclaredField("KEEP_ALIVE_TIME");
                declaredField.setAccessible(true);
                declaredField.set(null, 15);
            } catch (Exception e) {
                LoginTLogAdapter.trace(TAG, "init error", e);
            }
            try {
                i7l.b(this.context);
                this.initialized = true;
            } catch (Exception e2) {
                LoginTLogAdapter.trace(TAG, "init error", e2);
                HashMap hashMap = new HashMap();
                hashMap.put("code", "-3757");
                hashMap.put("msg", e2.getMessage());
                UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_failure_init_error", hashMap);
            }
        }
    }

    public void query(String str, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7d546c", new Object[]{this, str, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "query is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("key", str);
            if (!TextUtils.isEmpty(LoginStatus.savedOppo)) {
                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoKeyChain.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("data", LoginStatus.savedOppo);
                        commonDataCallback.onSuccess(hashMap2);
                    }
                });
            } else {
                BackgroundExecutor.execute(new AnonymousClass2(hashMap, commonDataCallback));
            }
        }
    }

    public void update(String str, String str2, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4575741", new Object[]{this, str, str2, commonDataCallback});
        } else if (!isSupport() || !this.initialized) {
            commonDataCallback.onFail(SDK_REMOTE_ERROR, "update is not enabled or initialized:isSupport()=" + isSupport() + ",initialized=" + this.initialized);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("key", str);
            hashMap.put("data", str2);
            if (LoginStatus.forceMockStrategy == 100) {
                LoginStatus.savedOppo = str2;
            } else {
                BackgroundExecutor.execute(new AnonymousClass3(hashMap, commonDataCallback));
            }
        }
    }

    public boolean isSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        try {
            return i7l.c(this.context);
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "isSupport error,", e);
            HashMap hashMap = new HashMap();
            hashMap.put("code", "-3742");
            hashMap.put("msg", e.getMessage());
            UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_is_support_error", hashMap);
            return false;
        }
    }
}
