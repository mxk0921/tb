package com.taobao.tao.shop.fetcher.adapter;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher;
import tb.lvr;
import tb.mvr;
import tb.nvr;
import tb.pvr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBSRDownloadAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_KNOWN_EXCEPTION = -2005;
    public static final int ERROR_RESPONSE_DATA_NULL = -2003;
    public static final int ERROR_RESPONSE_MD5_NOT_MATCH = -2004;
    public static final int ERROR_RESPONSE_NULL = -2001;
    public static final int ERROR_RESPONSE_STATUS_NOT_200 = -2002;

    /* renamed from: a  reason: collision with root package name */
    public a f12779a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TBSRDownloadException extends Exception {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int errorCode;
        private final String errorMsg;

        static {
            t2o.a(668991541);
        }

        public TBSRDownloadException(int i, String str) {
            this.errorCode = i;
            this.errorMsg = str;
        }

        public static /* synthetic */ Object ipc$super(TBSRDownloadException tBSRDownloadException, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/fetcher/adapter/TBSRDownloadAdapter$TBSRDownloadException");
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                return this;
            }
            return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
        }

        public int getErrorCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
            }
            return this.errorCode;
        }

        public String getErrorMsg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
            }
            return this.errorMsg;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(668991540);
    }

    public final void b(Object obj, TBSRDownloadException tBSRDownloadException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427d6d26", new Object[]{this, obj, tBSRDownloadException});
            return;
        }
        a aVar = this.f12779a;
        if (aVar == null) {
            mvr.a("TBSRDownloadAdapter is null !!!!");
        } else {
            ((TBSRUrlProcessFetcher.a) aVar).a(obj, tBSRDownloadException);
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa331fa0", new Object[]{this, aVar});
        } else {
            this.f12779a = aVar;
        }
    }

    public <DATA> DATA a(String str, String str2, Class<DATA> cls) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ipChange.ipc$dispatch("840ffb78", new Object[]{this, str, str2, cls});
        }
        Response syncSend = new DegradableNetwork(lvr.b).syncSend(new RequestImpl(str), null);
        if (syncSend == null) {
            mvr.d("[download] response is null");
            b(null, new TBSRDownloadException(-2001, "ERROR_RESPONSE_NULL"));
            return null;
        }
        int statusCode = syncSend.getStatusCode();
        if (statusCode != 200) {
            Throwable error = syncSend.getError();
            if (error == null) {
                str3 = "";
            } else {
                str3 = error.getMessage();
            }
            mvr.d("[download]  status:" + statusCode + "      error: " + str3);
            b(null, new TBSRDownloadException(-2002, "statusCode:" + statusCode + "  msg:" + str3));
            return null;
        }
        try {
            byte[] bytedata = syncSend.getBytedata();
            if (bytedata == null) {
                mvr.d("[download]  response bytedata is null");
                b(null, new TBSRDownloadException(-2003, "ERROR_RESPONSE_DATA_NULL"));
                return null;
            }
            String d = nvr.d(bytedata);
            if (!pvr.a(d) && d.equals(str2)) {
                DATA data = (DATA) JSON.parseObject(bytedata, cls, new Feature[0]);
                b(data, null);
                return data;
            }
            mvr.d("[download]  download data md5:" + d + " not match expect:" + str2);
            b(null, new TBSRDownloadException(-2004, "wantMd5: " + str2 + "  downloadMd5:" + d));
            return null;
        } catch (Exception e) {
            mvr.b(e, "[download]  download byte data parse error");
            b(null, new TBSRDownloadException(-2005, e.getMessage()));
            return null;
        }
    }
}
