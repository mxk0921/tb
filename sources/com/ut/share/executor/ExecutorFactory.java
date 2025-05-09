package com.ut.share.executor;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, IShareExecutor> executorMap;

    /* compiled from: Taobao */
    /* renamed from: com.ut.share.executor.ExecutorFactory$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ut$share$SharePlatform;

        static {
            int[] iArr = new int[SharePlatform.values().length];
            $SwitchMap$com$ut$share$SharePlatform = iArr;
            try {
                iArr[SharePlatform.SinaWeibo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Copy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.QZone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.SMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Alipay.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.DingTalk.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Messenger.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Line.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Telegram.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.WeChat.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.WhatsApp.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Instagram.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ut$share$SharePlatform[SharePlatform.Facebook.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Singleton {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ExecutorFactory instance = new ExecutorFactory(null);

        static {
            t2o.a(662700064);
        }

        private Singleton() {
        }

        public static /* synthetic */ ExecutorFactory access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorFactory) ipChange.ipc$dispatch("c9cb7a1c", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(662700062);
    }

    public /* synthetic */ ExecutorFactory(AnonymousClass1 r1) {
        this();
    }

    public static ExecutorFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorFactory) ipChange.ipc$dispatch("b8dfcf6", new Object[0]);
        }
        return Singleton.access$100();
    }

    public IShareExecutor findExecutor(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareExecutor) ipChange.ipc$dispatch("5b385bd0", new Object[]{this, sharePlatform});
        }
        IShareExecutor iShareExecutor = this.executorMap.get(sharePlatform.getValue());
        if (iShareExecutor == null) {
            switch (AnonymousClass1.$SwitchMap$com$ut$share$SharePlatform[sharePlatform.ordinal()]) {
                case 1:
                    iShareExecutor = new WeiboExecutor();
                    break;
                case 2:
                    iShareExecutor = new CopyExecutor();
                    break;
                case 4:
                    iShareExecutor = new MessageExecutor();
                    break;
                case 5:
                    iShareExecutor = new AlipayExecutor();
                    break;
                case 6:
                    iShareExecutor = new DingTalkExecutor();
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    iShareExecutor = new I18nAppExecutor();
                    break;
            }
            if (iShareExecutor != null) {
                this.executorMap.put(sharePlatform.getValue(), iShareExecutor);
            }
        }
        return iShareExecutor;
    }

    private ExecutorFactory() {
        this.executorMap = new HashMap();
    }
}
