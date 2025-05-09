package com.ap.zlz.toyger.zdoc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.Blob;
import com.alipay.zoloz.toyger.blob.Content;
import com.alipay.zoloz.toyger.blob.DocInfo;
import com.alipay.zoloz.toyger.blob.Meta;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ls7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DocBlobManagerJson extends ls7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366788);
    }

    private DocInfo generateDocInfo(ToygerDocInfo toygerDocInfo, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DocInfo) ipChange.ipc$dispatch("8d931c9f", new Object[]{this, toygerDocInfo, map});
        }
        DocInfo docInfo = new DocInfo();
        docInfo.docType = getDocType();
        docInfo.pageNo = getPageNum();
        return docInfo;
    }

    private int getFrameMode(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3b065ee", new Object[]{this, tGFrame})).intValue();
        }
        int i = tGFrame.frameMode;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                return -1;
            }
        }
        return i2;
    }

    public static /* synthetic */ Object ipc$super(DocBlobManagerJson docBlobManagerJson, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zlz/toyger/zdoc/DocBlobManagerJson");
    }

    public static Bitmap resize(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a6d680ee", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = i / width;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    @Override // tb.ls7
    public byte[] generateBlob(List<ToygerDocInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("83c7cf22", new Object[]{this, list, map});
        }
        ArrayList arrayList = new ArrayList();
        for (ToygerDocInfo toygerDocInfo : list) {
            DocBlobElement docBlobElement = new DocBlobElement();
            docBlobElement.type = "doc";
            if (toygerDocInfo.getBlobConfig() == null) {
                docBlobElement.subType = "docimage";
            } else {
                docBlobElement.subType = toygerDocInfo.getBlobConfig().subType;
            }
            docBlobElement.version = "1.0";
            docBlobElement.idx = 0;
            byte[] processFrame = processFrame(toygerDocInfo.frame, this.mCropRect);
            docBlobElement.content = processFrame;
            if (processFrame != null) {
                this.picSize = processFrame.length;
            } else {
                this.picSize = 0L;
            }
            docBlobElement.docInfo = generateDocInfo(toygerDocInfo, map);
            arrayList.add(docBlobElement);
        }
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Meta generateMeta = generateMeta(list, map);
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        return JSON.toJSONString(content).getBytes();
    }

    @Override // tb.ls7
    public boolean isUTF8() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20ca7ec6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public byte[] processFrame(TGFrame tGFrame, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("efd3539b", new Object[]{this, tGFrame, rect});
        }
        if (rect == null) {
            rect = new Rect(0, 0, 0, 0);
        }
        return processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate(0) * 100.0f), rect);
    }

    private Meta generateMeta(List<ToygerDocInfo> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Meta) ipChange.ipc$dispatch("56fd2862", new Object[]{this, list, map});
        }
        Meta meta = new Meta();
        meta.type = "zdoc";
        meta.serialize = 1;
        HashMap hashMap = new HashMap();
        meta.collectInfo = hashMap;
        hashMap.put("docType", getDocType());
        meta.collectInfo.put(ls7.INFO_PAGE_NUMBER, Integer.valueOf(getPageNum()));
        meta.collectInfo.put(ls7.INFO_PIC_SIZE, Long.valueOf(this.picSize));
        if (map != null && map.size() > 0) {
            meta.collectInfo.putAll(map);
        }
        return meta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6, types: [byte[]] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame r10, int r11, int r12, android.graphics.Rect r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zlz.toyger.zdoc.DocBlobManagerJson.processFrame(com.alipay.zoloz.toyger.algorithm.TGFrame, int, int, android.graphics.Rect):byte[]");
    }
}
