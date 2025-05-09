package com.sina.weibo.sdk.web.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.b;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.net.c;
import com.sina.weibo.sdk.web.b.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d extends b {
    public WeiboMultiMessage aE;
    private byte[] aF;
    String aG;
    public String ae;
    public String packageName;
    private String text;

    static {
        t2o.a(988807263);
    }

    public d(AuthInfo authInfo) {
        super(authInfo, 1, null, null);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void a(Bundle bundle) {
        WeiboMultiMessage weiboMultiMessage = this.aE;
        if (weiboMultiMessage != null) {
            weiboMultiMessage.writeToBundle(bundle);
        }
        bundle.putString("token", this.ae);
        bundle.putString("packageName", this.packageName);
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void b(Bundle bundle) {
        byte[] bArr;
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        this.aE = weiboMultiMessage;
        weiboMultiMessage.readFromBundle(bundle);
        this.ae = bundle.getString("token");
        this.packageName = bundle.getString("packageName");
        StringBuilder sb = new StringBuilder();
        TextObject textObject = this.aE.textObject;
        if (textObject != null) {
            sb.append(textObject.text);
        }
        ImageObject imageObject = this.aE.imageObject;
        if (imageObject != null) {
            String str = imageObject.imagePath;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    byte[] bArr2 = new byte[(int) file.length()];
                    FileInputStream fileInputStream2 = null;
                    try {
                        try {
                            fileInputStream = new FileInputStream(file);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        fileInputStream.read(bArr2);
                        this.aF = e.b(bArr2);
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream2 = fileInputStream;
                        e.printStackTrace();
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        bArr = imageObject.imageData;
                        if (bArr != null) {
                            this.aF = e.b(bArr);
                        }
                        this.text = sb.toString();
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            }
            bArr = imageObject.imageData;
            if (bArr != null && bArr.length > 0) {
                this.aF = e.b(bArr);
            }
        }
        this.text = sb.toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final String getUrl() {
        Uri.Builder buildUpon = Uri.parse("https://service.weibo.com/share/mobilesdk.php").buildUpon();
        buildUpon.appendQueryParameter("title", this.text);
        buildUpon.appendQueryParameter("version", "0041005000");
        String appKey = this.aC.a().getAppKey();
        if (!TextUtils.isEmpty(appKey)) {
            buildUpon.appendQueryParameter("source", appKey);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            buildUpon.appendQueryParameter("access_token", this.ae);
        }
        if (!TextUtils.isEmpty(this.packageName)) {
            buildUpon.appendQueryParameter(NewHtcHomeBadger.PACKAGENAME, this.packageName);
        }
        if (!TextUtils.isEmpty(this.aG)) {
            buildUpon.appendQueryParameter("picinfo", this.aG);
        }
        buildUpon.appendQueryParameter("luicode", "10000360");
        buildUpon.appendQueryParameter("lfid", "OP_".concat(String.valueOf(appKey)));
        return buildUpon.build().toString();
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final boolean t() {
        byte[] bArr = this.aF;
        if (bArr == null || bArr.length <= 0) {
            return super.t();
        }
        return true;
    }

    public d(Context context) {
        this.Z = context;
    }

    @Override // com.sina.weibo.sdk.web.b.b
    public final void a(final b.a aVar) {
        com.sina.weibo.sdk.a.b bVar;
        com.sina.weibo.sdk.a.d dVar = new com.sina.weibo.sdk.a.d(this.Z, new String(this.aF), this.aC.a().getAppKey(), this.ae, new c<String>() { // from class: com.sina.weibo.sdk.web.b.d.1
            @Override // com.sina.weibo.sdk.net.c
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                com.sina.weibo.sdk.b.c.a("WbShareTag", "handle image result :".concat(String.valueOf(str2)));
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int optInt = jSONObject.optInt("code");
                        String optString = jSONObject.optString("data");
                        if (optInt != 1 || TextUtils.isEmpty(optString)) {
                            b.a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.onError("图片内容不合适，禁止上传！");
                                return;
                            }
                            return;
                        }
                        d.this.aG = optString;
                        b.a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.onComplete();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        b.a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.onError("解析服务端返回的字符串时发生异常！");
                        }
                    }
                } else {
                    b.a aVar5 = aVar;
                    if (aVar5 != null) {
                        aVar5.onError("处理图片，服务端返回null!");
                    }
                }
            }

            @Override // com.sina.weibo.sdk.net.c
            public final void onError(Throwable th) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onError(th.getMessage());
                }
            }
        });
        bVar = b.a.K;
        bVar.a(dVar);
    }
}
