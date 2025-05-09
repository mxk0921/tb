package com.taobao.umipublish.extension.windvane.abilities;

import android.graphics.Bitmap;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.tao.Globals;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.weex.common.Constants;
import java.nio.ByteBuffer;
import tb.ed2;
import tb.i8g;
import tb.kuu;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImageWaterMarkAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ImageWaterMarkAbility";

    static {
        t2o.a(944767163);
    }

    private void addWaterMask(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512b411d", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("downloadList", (Object) jSONArray);
        jSONObject2.put("url", (Object) str);
        jSONObject2.put(Constants.Name.SUFFIX, (Object) ".jpg");
        jSONArray.add(jSONObject2);
        DownloadFilesAbility downloadFilesAbility = new DownloadFilesAbility();
        downloadFilesAbility.setContext(Globals.getApplication());
        downloadFilesAbility.setListener(new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageWaterMarkAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb8b0117", new Object[]{this, str3, str4});
                    return;
                }
                ImageWaterMarkAbility imageWaterMarkAbility = ImageWaterMarkAbility.this;
                imageWaterMarkAbility.errorCallback("10001", "DOWNLOAD_WATERMARK_FAILED_" + str3 + "_" + str4);
                odg.c(ImageWaterMarkAbility.TAG, "download water mark failed_" + str3 + "_" + str4);
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void onProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void onSuccess(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("980108a5", new Object[]{this, jSONObject3});
                    return;
                }
                try {
                    String string = jSONObject3.getJSONArray("fileList").getJSONObject(0).getString("path");
                    ImageBean k = kuu.k(str2);
                    final int i = k.width;
                    final int i2 = k.height;
                    Project createProject = Marvel.createProject();
                    MeEditor meEditor = createProject.getMeEditor();
                    meEditor.setCanvasSize(i, i2);
                    meEditor.addMainClip(str2, 0L, -1L);
                    String addPipClip = meEditor.addPipClip("", string, 0L, 0L, -1L);
                    meEditor.setScale(addPipClip, 0.223f);
                    meEditor.setPosition(addPipClip, 0.473f, 0.466f);
                    meEditor.setAnchor(addPipClip, 0.5f, 0.5f);
                    ImageExporter imageExporter = new ImageExporter();
                    imageExporter.setWidth(i);
                    imageExporter.setHeight(i2);
                    imageExporter.setBitmapListener(new ImageExporter.c() { // from class: com.taobao.umipublish.extension.windvane.abilities.ImageWaterMarkAbility.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public void a(long j, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b1d61e62", new Object[]{this, new Long(j), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), byteBuffer});
                                return;
                            }
                            String e = i8g.e(ImageWaterMarkAbility.this.mContext);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(byteBuffer);
                            ed2.q(createBitmap, e);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("filePath", (Object) e);
                            ImageWaterMarkAbility.this.successCallback(jSONObject4);
                        }
                    });
                    createProject.export(imageExporter);
                } catch (Throwable th) {
                    ImageWaterMarkAbility.this.errorCallback("10001", "DOWNLOAD_WATERMARK_FAILED");
                    odg.c(ImageWaterMarkAbility.TAG, "download water mark failed" + Log.getStackTraceString(th));
                }
            }
        });
        downloadFilesAbility.execute(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(ImageWaterMarkAbility imageWaterMarkAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/ImageWaterMarkAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("10001", "EMPTY_PARAMS");
        } else {
            addWaterMask(jSONObject.getString("waterMarkUrl"), jSONObject.getString("imagePath"));
        }
    }
}
