package com.ut.share;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareResponse;
import com.ut.share.adapter.ShareShortenAdapter;
import com.ut.share.data.ShareData;
import com.ut.share.executor.ExecutorFactory;
import com.ut.share.executor.IShareExecutor;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.ShareLinkWrapper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int RECEIVE_SHORTEN_LINK_FLAG = 143879027;
    private Context mContext;
    private ShareListener mListener;
    private SharePlatform mPlatform;
    private Handler mReceiveShortUrlHandler;
    private ShareData mShareData;
    private ShareShortenAdapter mShorten;
    private boolean running;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Singleton {
        public static ShareApi instance = new ShareApi();

        static {
            t2o.a(662700038);
        }

        private Singleton() {
        }
    }

    static {
        t2o.a(662700034);
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return RECEIVE_SHORTEN_LINK_FLAG;
    }

    public static /* synthetic */ Context access$200(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e6a33553", new Object[]{shareApi});
        }
        return shareApi.mContext;
    }

    public static /* synthetic */ SharePlatform access$300(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePlatform) ipChange.ipc$dispatch("729d034b", new Object[]{shareApi});
        }
        return shareApi.mPlatform;
    }

    public static /* synthetic */ ShareData access$400(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareData) ipChange.ipc$dispatch("1f058e14", new Object[]{shareApi});
        }
        return shareApi.mShareData;
    }

    public static /* synthetic */ ShareListener access$500(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareListener) ipChange.ipc$dispatch("8a56dfbf", new Object[]{shareApi});
        }
        return shareApi.mListener;
    }

    public static /* synthetic */ void access$600(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785325d7", new Object[]{shareApi});
        } else {
            shareApi.utProcess();
        }
    }

    public static /* synthetic */ void access$700(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ffd176", new Object[]{shareApi});
        } else {
            shareApi.shortenProcess();
        }
    }

    public static /* synthetic */ ShareShortenAdapter access$800(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareShortenAdapter) ipChange.ipc$dispatch("77fdf3f9", new Object[]{shareApi});
        }
        return shareApi.mShorten;
    }

    public static /* synthetic */ Handler access$900(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f9244192", new Object[]{shareApi});
        }
        return shareApi.mReceiveShortUrlHandler;
    }

    public static ShareApi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareApi) ipChange.ipc$dispatch("efa29676", new Object[0]);
        }
        return Singleton.instance;
    }

    private void shortenProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146ec011", new Object[]{this});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.ut.share.ShareApi.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ShareApi.access$800(ShareApi.this) != null) {
                        str = ShareApi.access$800(ShareApi.this).shortenURL(ShareApi.access$400(ShareApi.this).getLink());
                    } else {
                        str = ShareLinkWrapper.shortenURL(ShareApi.access$400(ShareApi.this).getLink());
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ShareApi.access$400(ShareApi.this).setLink(str);
                    }
                    Message message = new Message();
                    message.what = ShareApi.access$100();
                    ShareApi.access$900(ShareApi.this).sendMessage(message);
                }
            });
        }
    }

    private void utProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edca6357", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mShareData.getLink())) {
            this.mShareData.setLink(ShareLinkWrapper.wrapShareLink(this.mShareData.getBusinessId(), this.mPlatform.name(), this.mShareData.getLink()));
        }
    }

    public boolean canShare(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881dd8c5", new Object[]{this, context, sharePlatform})).booleanValue();
        }
        IShareExecutor findExecutor = ExecutorFactory.getInstance().findExecutor(sharePlatform);
        if (findExecutor != null) {
            return findExecutor.isAppAvailable(context, sharePlatform);
        }
        return false;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.running = false;
        this.mContext = null;
        this.mPlatform = SharePlatform.Other;
        this.mShareData = null;
        this.mListener = null;
    }

    public void registerShortenAdapter(ShareShortenAdapter shareShortenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de8340c", new Object[]{this, shareShortenAdapter});
        } else {
            this.mShorten = shareShortenAdapter;
        }
    }

    public void share(final Context context, final SharePlatform sharePlatform, final ShareData shareData, boolean z, final ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad73719b", new Object[]{this, context, sharePlatform, shareData, new Boolean(z), shareListener});
        } else if (!this.running) {
            this.running = true;
            this.mContext = context;
            this.mPlatform = sharePlatform;
            this.mShareData = shareData;
            this.mListener = shareListener;
            if (context == null || shareData == null) {
                if (shareListener != null) {
                    ShareResponse shareResponse = new ShareResponse();
                    shareResponse.platform = sharePlatform;
                    shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
                    shareListener.onResponse(shareResponse);
                }
                clear();
            } else if (!z) {
                ExecutorFactory.getInstance().findExecutor(sharePlatform).share(context, shareData, shareListener);
                clear();
            } else {
                this.mReceiveShortUrlHandler = new Handler(context.getMainLooper()) { // from class: com.ut.share.ShareApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        if (str.hashCode() == 673877017) {
                            super.handleMessage((Message) objArr[0]);
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/ShareApi$1");
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        super.handleMessage(message);
                        if (message.what == ShareApi.access$100()) {
                            ExecutorFactory.getInstance().findExecutor(ShareApi.access$300(ShareApi.this)).share(ShareApi.access$200(ShareApi.this), ShareApi.access$300(ShareApi.this), ShareApi.access$400(ShareApi.this), ShareApi.access$500(ShareApi.this));
                        }
                        ShareApi.this.clear();
                    }
                };
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.ut.share.ShareApi.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (ShareApi.access$400(ShareApi.this) != null) {
                            ShareApi.access$600(ShareApi.this);
                            SharePlatform sharePlatform2 = sharePlatform;
                            if ((sharePlatform2 == SharePlatform.Messenger || sharePlatform2 == SharePlatform.Facebook || sharePlatform2 == SharePlatform.Instagram || sharePlatform2 == SharePlatform.Line || sharePlatform2 == SharePlatform.Telegram || sharePlatform2 == SharePlatform.WeChat || sharePlatform2 == SharePlatform.WhatsApp || sharePlatform2 == SharePlatform.SinaWeibo || sharePlatform2 == SharePlatform.Copy || sharePlatform2 == SharePlatform.SMS || sharePlatform2 == SharePlatform.Weixin || sharePlatform2 == SharePlatform.WeixinPengyouquan || sharePlatform2 == SharePlatform.DingTalk) && !TextUtils.isEmpty(shareData.getLink())) {
                                ShareApi.access$700(ShareApi.this);
                                return;
                            }
                            ExecutorFactory.getInstance().findExecutor(sharePlatform).share(context, shareData, shareListener);
                            ShareApi.this.clear();
                        }
                    }
                });
            }
        }
    }

    public boolean supportImageShare(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e206ad", new Object[]{this, sharePlatform})).booleanValue();
        }
        IShareExecutor findExecutor = ExecutorFactory.getInstance().findExecutor(sharePlatform);
        if (findExecutor != null) {
            return findExecutor.supportImageShare();
        }
        return false;
    }

    private ShareApi() {
        this.running = false;
    }

    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
        } else {
            share(context, sharePlatform, shareData, true, shareListener);
        }
    }
}
