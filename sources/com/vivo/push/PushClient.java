package com.vivo.push;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.b.f;
import com.vivo.push.d.a;
import com.vivo.push.d.d;
import com.vivo.push.listener.IPushQueryActionListener;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PushClient extends a implements a {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;
    private Context mContext;
    private boolean mIsInitSdk;
    private boolean mIsSdkInited = true;
    private a mSyncProfileInfo = new d();

    private PushClient(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        com.vivo.push.restructure.a.a().a(context);
        m.a().a(context);
    }

    private boolean checkAgreePrivacyStatementAndInitSdk() {
        if (!com.vivo.push.restructure.a.a().e().l().isAgreePrivacyStatement()) {
            return false;
        }
        inidSdk(this.mContext);
        return true;
    }

    private void checkParam(String str) {
        if (str == null) {
            throw new IllegalArgumentException("PushManager String param should not be ".concat(String.valueOf(str)));
        }
    }

    private String getAppId(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return com.vivo.push.restructure.a.a().e().a();
    }

    private String getAppKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return com.vivo.push.restructure.a.a().e().c();
    }

    public static synchronized PushClient getInstance(Context context) {
        PushClient pushClient;
        synchronized (PushClient.class) {
            try {
                if (sPushClient == null) {
                    sPushClient = new PushClient(context.getApplicationContext());
                }
                pushClient = sPushClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pushClient;
    }

    private void inidSdk(Context context) {
        synchronized (this) {
            try {
                if (!this.mIsInitSdk) {
                    m.a().a(context);
                    this.mIsInitSdk = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isSdkInited() {
        return this.mIsSdkInited;
    }

    @Override // com.vivo.push.d.a
    public void addProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else if (isSdkInited()) {
            a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.addProfileId(str, iPushRequestCallback);
            }
        } else if (iPushRequestCallback != null) {
            iPushRequestCallback.onError(8011);
        }
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            checkParam(str);
            m.a().a(str, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    public void checkManifest() throws VivoPushException {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            m.a().b();
        }
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(str);
            m.a().b(arrayList, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    @Override // com.vivo.push.d.a
    public void deleteAllProfileId(IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else if (isSdkInited()) {
            a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.deleteAllProfileId(iPushRequestCallback);
            }
        } else if (iPushRequestCallback != null) {
            iPushRequestCallback.onError(8011);
        }
    }

    @Override // com.vivo.push.d.a
    public void deleteProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else if (isSdkInited()) {
            a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.deleteProfileId(str, iPushRequestCallback);
            }
        } else if (iPushRequestCallback != null) {
            iPushRequestCallback.onError(8011);
        }
    }

    public void deleteRegid(IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            super.deleteRegid(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    public String getAlias() {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            return m.a().i();
        }
        return null;
    }

    @Override // com.vivo.push.a
    public void getRegId(IPushQueryActionListener iPushQueryActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushQueryActionListener != null) {
                iPushQueryActionListener.onFail(104);
            }
        } else if (isSdkInited()) {
            super.getRegId(iPushQueryActionListener);
        } else if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onFail(8011);
        }
    }

    public List<String> getTopics() {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            return new ArrayList();
        }
        if (!isSdkInited()) {
            return new ArrayList();
        }
        m.a();
        return m.c();
    }

    public String getVersion() {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            return "3.4.0.0";
        }
        return null;
    }

    public void initialize(PushConfig pushConfig) throws VivoPushException {
        if (pushConfig != null) {
            com.vivo.push.restructure.a.a().e().a(pushConfig);
            initialize();
            return;
        }
        throw new VivoPushException("initialize error config is null");
    }

    public boolean isSupport() {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            return m.a().d();
        }
        return false;
    }

    public int isSupportNewControlStrategies() {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            return com.vivo.push.restructure.a.a().g().a();
        }
        return -1;
    }

    public int isSupportSyncProfileInfo() {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            return com.vivo.push.restructure.a.a().g().b();
        }
        return -1;
    }

    @Override // com.vivo.push.d.a
    public void queryProfileIds(IPushRequestCallback<List<String>> iPushRequestCallback) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(104);
            }
        } else if (isSdkInited()) {
            a aVar = this.mSyncProfileInfo;
            if (aVar != null) {
                aVar.queryProfileIds(iPushRequestCallback);
            }
        } else if (iPushRequestCallback != null) {
            iPushRequestCallback.onError(8011);
        }
    }

    @Override // com.vivo.push.a
    public void querySubscribeState(IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk() && iPushActionListener != null) {
            iPushActionListener.onStateChanged(104);
        }
        if (!isSdkInited() && iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
        super.querySubscribeState(iPushActionListener);
    }

    public void setSystemModel(boolean z) {
        if (checkAgreePrivacyStatementAndInitSdk() && isSdkInited()) {
            m.a().a(z);
        }
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(str);
            m.a().a(arrayList, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            m.a().c(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            m.a().a(iPushActionListener, getAppId(""), getAppKey(""));
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        if (!checkAgreePrivacyStatementAndInitSdk()) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(104);
            }
        } else if (isSdkInited()) {
            checkParam(str);
            m.a().b(str, getAppId(""), getAppKey(""), iPushActionListener);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(8011);
        }
    }

    private void initialize() throws VivoPushException {
        if (checkAgreePrivacyStatementAndInitSdk()) {
            checkManifest();
            m a2 = m.a();
            f fVar = new f();
            com.vivo.push.restructure.a.a();
            fVar.d();
            a2.a(fVar);
            if (!this.mIsSdkInited) {
                this.mIsSdkInited = true;
            }
        }
    }
}
