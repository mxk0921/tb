package com.huawei.searchabilitymanager.client.model;

import com.alibaba.ariver.kernel.RVConstants;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.nb.searchmanager.utils.logger.DSLog;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.trtc.api.TrtcConstants;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import tb.to8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SearchableItemAttributeSet extends IndexData {
    private static final String TAG = "SearchableItemAttributeSet";
    private String CSActionIdentifier;
    private String action;
    private String actionIdentifiers;
    private String activityKeywords;
    private String activityTitle;
    private String activityType;
    private String additionalRecipients;
    private String album;
    private String alternateNames;
    private int appType;
    private String artist;
    private String authors;
    private String category;
    private String city;
    private String comment;
    private String completionDate;
    private String componentName;
    private String contentDescription;
    private float contentRating;
    private String contentType;
    private String contentURL;
    private String country;
    private String creator;
    private String darkThumbnailURL;
    private String dataMimeType;
    private String dataURI;
    private String description;
    private String displayName;
    private String downloadedDate;
    private String dueDate;
    private long duration;
    private String endDate;
    private String expirationDate;
    private long fileSize;
    private String genre;
    private String gpsAreaInformation;
    private String groupId;
    private String hiddenAdditionalRecipients;
    private String identifier;
    private String importantDates;
    private int isAddedtoChart;
    private int isAddedtoCollection;
    private int isBrowsed;
    private int isEligibleForHandoff;
    private int isEligibleForPublicIndexing;
    private int isPriceDrop;
    private int isUserActivity;
    private String keyWords;
    private String kind;
    private String lastUsedDate;
    private float latitude;
    private int likelyJunk;
    private int local;
    private String logoURL;
    private float longitude;
    private String lyricist;
    private String metadataModificationDate;
    private String musicalGenre;
    private String namedLocation;
    private String orderDeliverDetails;
    private int orderStatus;
    private String originalSource;
    private String path;
    private String performers;
    private String persistentIdentifier;
    private String phoneNumber;
    private String phoneNumbers;
    private float pixelHeight;
    private float pixelWidth;
    private long playCount;
    private String primaryRecipients;
    private String producer;
    private float productPrice;
    private float productRating;
    private float rankingHint;
    private int rankingTag;
    private float rating;
    private String ratingDescription;
    private int saleNumber;
    private SimpleDateFormat smFormat = new SimpleDateFormat("yyyy.MM.dd");
    private String startDate;
    private String stateOrProvince;
    private int storeStatus;
    private String subThoroughfare;
    private String subject;
    private int supportsNavigation;
    private int supportsPhoneCall;
    private String tag;
    private String textContent;
    private String theme;
    private String thoroughfare;
    private String thumbnailURL;
    private String title;
    private String uniqueIdentifier;
    private String url;
    private long userCreated;
    private String webPageUrl;

    public SearchableItemAttributeSet(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 100313435:
                if (str.equals("image")) {
                    c = 0;
                    break;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    c = 1;
                    break;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    c = 2;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c = 3;
                    break;
                }
                break;
            case 1554253136:
                if (str.equals("application")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                this.contentType = str;
                return;
            default:
                this.contentType = "";
                return;
        }
    }

    public static List<IndexForm> getCommonIndexForm() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IndexForm("uniqueIdentifier", "noAnalyzed", true, true, false));
        arrayList.add(new IndexForm("contentType", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm(SimpleProfile.KEY_DISPLAYNAME, "analyzed", false, true, false));
        arrayList.add(new IndexForm("description", "analyzed", false, true, false));
        arrayList.add(new IndexForm("alternateNames", "analyzed", false, true, true));
        arrayList.add(new IndexForm("contentURL", "no", false, true, false));
        arrayList.add(new IndexForm("path", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("title", "analyzed", false, true, true));
        arrayList.add(new IndexForm("metadataModificationDate", "no", false, true, false));
        arrayList.add(new IndexForm("keyWords", "analyzed", false, true, true));
        arrayList.add(new IndexForm("darkThumbnailURL", "no", false, true, false));
        arrayList.add(new IndexForm("thumbnailURL", "no", false, true, false));
        arrayList.add(new IndexForm("logoURL", "no", false, true, false));
        arrayList.add(new IndexForm("rankingHint", "float", false, true, false));
        arrayList.add(new IndexForm("groupId", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("userCreated", "long", false, true, true));
        arrayList.add(new IndexForm("identifier", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("contentDescription ", "analyzed", false, true, true));
        arrayList.add(new IndexForm("creator", "analyzed", false, true, false));
        arrayList.add(new IndexForm("fileSize", "long", false, true, false));
        arrayList.add(new IndexForm("kind", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("subject", "analyzed", false, true, true));
        arrayList.add(new IndexForm("theme", "analyzed", false, true, true));
        arrayList.add(new IndexForm("downloadedDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("lastUsedDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("duration", "long", false, true, false));
        arrayList.add(new IndexForm("contentRating", "float", false, true, false));
        arrayList.add(new IndexForm("local", "integer", false, true, false));
        arrayList.add(new IndexForm("originalSource", "analyzed", false, true, false));
        arrayList.add(new IndexForm("performers", "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("playCount", "long", false, true, false));
        arrayList.add(new IndexForm("producer", "analyzed", false, true, true));
        arrayList.add(new IndexForm("rating", "float", false, true, false));
        arrayList.add(new IndexForm("ratingDescription", "analyzed", false, true, true));
        arrayList.add(new IndexForm("url", "no", false, true, false));
        arrayList.add(new IndexForm(to8.COMMENT, "analyzed", false, true, true));
        arrayList.add(new IndexForm("genre", "analyzed", false, true, true));
        arrayList.add(new IndexForm("album", "analyzed", false, true, true));
        arrayList.add(new IndexForm("artist", "analyzed", false, true, true));
        arrayList.add(new IndexForm("lyricist", "analyzed", false, true, true));
        arrayList.add(new IndexForm("musicalGenre", "analyzed", false, true, true));
        arrayList.add(new IndexForm("actionIdentifiers", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("supportsNavigation", "integer", false, true, false));
        arrayList.add(new IndexForm("supportsPhoneCall", "integer", false, true, false));
        arrayList.add(new IndexForm("CSActionIdentifier", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER, "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("primaryRecipients", "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("additionalRecipients", "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("hiddenAdditionalRecipients", "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("authors", "noAnalyzed", false, true, true));
        arrayList.add(new IndexForm("textContent", "analyzed", false, true, true));
        arrayList.add(new IndexForm("likelyJunk", "integer", false, true, false));
        arrayList.add(new IndexForm("gpsAreaInformation", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("city", "analyzed", false, true, true));
        arrayList.add(new IndexForm("country", "analyzed", false, true, true));
        arrayList.add(new IndexForm("stateOrProvince", "analyzed", false, true, true));
        arrayList.add(new IndexForm("namedLocation", "analyzed", false, true, true));
        arrayList.add(new IndexForm("subThoroughfare", "analyzed", false, true, true));
        arrayList.add(new IndexForm("thoroughfare", "analyzed", false, true, true));
        arrayList.add(new IndexForm("latitude", "float", false, true, false));
        arrayList.add(new IndexForm("longitude", "float", false, true, false));
        arrayList.add(new IndexForm("pixelHeight", "float", false, true, false));
        arrayList.add(new IndexForm("pixelWidth", "float", false, true, false));
        arrayList.add(new IndexForm("tag", "analyzed", false, true, true));
        arrayList.add(new IndexForm("phoneNumbers", "analyzed", false, true, true));
        arrayList.add(new IndexForm("completionDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("dueDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("endDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("importantDates", "no", false, true, false));
        arrayList.add(new IndexForm("startDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("isUserActivity", "integer", false, true, false));
        arrayList.add(new IndexForm("activityType", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("persistentIdentifier", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("activityTitle", "analyzed", false, true, true));
        arrayList.add(new IndexForm("activityKeywords", "analyzed", false, true, true));
        arrayList.add(new IndexForm("isEligibleForPublicIndexing", "no", false, true, false));
        arrayList.add(new IndexForm("isEligibleForHandoff", "no", false, true, false));
        arrayList.add(new IndexForm("componentName", "no", false, true, false));
        arrayList.add(new IndexForm("action", "no", false, true, false));
        arrayList.add(new IndexForm("dataURI", "no", false, true, false));
        arrayList.add(new IndexForm("dataMimeType", "no", false, true, false));
        arrayList.add(new IndexForm("webPageUrl", "no", false, true, false));
        arrayList.add(new IndexForm("expirationDate", "sorted", false, true, false));
        arrayList.add(new IndexForm("category", "noAnalyzed", false, true, false));
        arrayList.add(new IndexForm("isBrowsed", "no", false, true, false));
        arrayList.add(new IndexForm("isAddedtoCollection", "no", false, true, false));
        arrayList.add(new IndexForm("isAddedtoChart", "no", false, true, false));
        arrayList.add(new IndexForm("productPrice", "float", false, true, false));
        arrayList.add(new IndexForm("productRating", "float", false, true, false));
        arrayList.add(new IndexForm("saleNumber", "integer", false, true, false));
        arrayList.add(new IndexForm("isPriceDrop", "no", false, true, false));
        arrayList.add(new IndexForm("storeStatus", "integer", false, true, false));
        arrayList.add(new IndexForm("orderStatus", "integer", false, true, false));
        arrayList.add(new IndexForm("orderDeliverDetails", "analyzed", false, true, false));
        arrayList.add(new IndexForm("rankingTag", "integer", false, true, false));
        arrayList.add(new IndexForm(RVConstants.EXTRA_APPTYPE, "integer", false, true, false));
        return arrayList;
    }

    public String getAction() {
        return super.getAsString("action");
    }

    public String getActionIdentifiers() {
        return super.getAsString("actionIdentifiers");
    }

    public String getActivityKeywords() {
        return super.getAsString("activityKeywords");
    }

    public String getActivityTitle() {
        return super.getAsString("activityTitle");
    }

    public String getActivityType() {
        return super.getAsString("activityType");
    }

    public String getAdditionalRecipients() {
        return super.getAsString("additionalRecipients");
    }

    public String getAlbum() {
        return super.getAsString("album");
    }

    public String getAlternateNames() {
        return super.getAsString("alternateNames");
    }

    public int getAppType() {
        return super.getAsInteger(RVConstants.EXTRA_APPTYPE).intValue();
    }

    public String getArtist() {
        return super.getAsString("artist");
    }

    public String getAuthors() {
        return super.getAsString("authors");
    }

    public String getCSActionIdentifier() {
        return super.getAsString("CSActionIdentifier");
    }

    public String getCategory() {
        return super.getAsString("category");
    }

    public String getCity() {
        return super.getAsString("city");
    }

    public String getComment() {
        return super.getAsString(to8.COMMENT);
    }

    public String getCompletionDate() {
        return super.getAsString("completionDate");
    }

    public String getComponentName() {
        return super.getAsString("componentName");
    }

    public String getContentDescription() {
        return super.getAsString("contentDescription ");
    }

    public float getContentRating() {
        return super.getAsFloat("contentRating").floatValue();
    }

    public String getContentType() {
        return super.getAsString("contentType");
    }

    public String getContentURL() {
        return super.getAsString("contentURL");
    }

    public String getCountry() {
        return super.getAsString("country");
    }

    public String getCreator() {
        return super.getAsString("creator");
    }

    public String getDarkThumbnailURL() {
        return super.getAsString("darkThumbnailURL");
    }

    public String getDataMimeType() {
        return super.getAsString("dataMimeType");
    }

    public String getDataURI() {
        return super.getAsString("dataURI");
    }

    public String getDescription() {
        return super.getAsString("description");
    }

    public String getDisplayName() {
        return super.getAsString(SimpleProfile.KEY_DISPLAYNAME);
    }

    public String getDownloadedDate() {
        return super.getAsString("downloadedDate");
    }

    public String getDueDate() {
        return super.getAsString("dueDate");
    }

    public long getDuration() {
        return super.getAsLong("duration").longValue();
    }

    public String getEndDate() {
        return super.getAsString("endDate");
    }

    public String getExpirationDate() {
        return super.getAsString("expirationDate");
    }

    public long getFileSize() {
        return super.getAsLong("fileSize").longValue();
    }

    public String getGenre() {
        return super.getAsString("genre");
    }

    public String getGpsAreaInformation() {
        return super.getAsString("gpsAreaInformation");
    }

    public String getGroupId() {
        return super.getAsString("groupId");
    }

    public String getHiddenAdditionalRecipients() {
        return super.getAsString("hiddenAdditionalRecipients");
    }

    public String getIdentifier() {
        return super.getAsString("identifier");
    }

    public String getImportantDates() {
        return super.getAsString("importantDates");
    }

    public int getIsAddedtoChart() {
        return super.getAsInteger("isAddedtoChart").intValue();
    }

    public int getIsAddedtoCollection() {
        return super.getAsInteger("isAddedtoCollection").intValue();
    }

    public int getIsBrowsed() {
        return super.getAsInteger("isBrowsed").intValue();
    }

    public int getIsEligibleForHandoff() {
        return super.getAsInteger("isEligibleForHandoff").intValue();
    }

    public int getIsEligibleForPublicIndexing() {
        return super.getAsInteger("isEligibleForPublicIndexing").intValue();
    }

    public int getIsPriceDrop() {
        return super.getAsInteger("isPriceDrop").intValue();
    }

    public int getIsUserActivity() {
        return super.getAsInteger("isUserActivity").intValue();
    }

    public String getKeyWords() {
        return super.getAsString("keyWords");
    }

    public String getKind() {
        return super.getAsString("kind");
    }

    public String getLastUsedDate() {
        return super.getAsString("lastUsedDate");
    }

    public float getLatitude() {
        return super.getAsFloat("latitude").floatValue();
    }

    public int getLikelyJunk() {
        return super.getAsInteger("likelyJunk").intValue();
    }

    public int getLocal() {
        return super.getAsInteger("local").intValue();
    }

    public String getLogoURL() {
        return super.getAsString("logoURL");
    }

    public float getLongitude() {
        return super.getAsFloat("longitude").floatValue();
    }

    public String getLyricist() {
        return super.getAsString("lyricist");
    }

    public String getMetadataModificationDate() {
        return super.getAsString("metadataModificationDate");
    }

    public String getMusicalGenre() {
        return super.getAsString("musicalGenre");
    }

    public String getNamedLocation() {
        return super.getAsString("namedLocation");
    }

    public String getOrderDeliverDetails() {
        return super.getAsString("orderDeliverDetails");
    }

    public int getOrderStatus() {
        return super.getAsInteger("orderStatus").intValue();
    }

    public String getOriginalSource() {
        return super.getAsString("originalSource");
    }

    public String getPath() {
        return super.getAsString("path");
    }

    public String getPerformers() {
        return super.getAsString("performers");
    }

    public String getPersistentIdentifier() {
        return super.getAsString("persistentIdentifier");
    }

    public String getPhoneNumber() {
        return super.getAsString(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER);
    }

    public String getPhoneNumbers() {
        return super.getAsString("phoneNumbers");
    }

    public float getPixelHeight() {
        return super.getAsFloat("pixelHeight").floatValue();
    }

    public float getPixelWidth() {
        return super.getAsFloat("pixelWidth").floatValue();
    }

    public long getPlayCount() {
        return super.getAsLong("playCount").longValue();
    }

    public String getPrimaryRecipients() {
        return super.getAsString("primaryRecipients");
    }

    public String getProducer() {
        return super.getAsString("producer");
    }

    public float getProductPrice() {
        return super.getAsFloat("productPrice").floatValue();
    }

    public float getProductRating() {
        return super.getAsFloat("productRating").floatValue();
    }

    public float getRankingHint() {
        return super.getAsFloat("rankingHint").floatValue();
    }

    public int getRankingTag() {
        return super.getAsInteger("rankingTag").intValue();
    }

    public float getRating() {
        return super.getAsFloat("rating").floatValue();
    }

    public String getRatingDescription() {
        return super.getAsString("ratingDescription");
    }

    public int getSaleNumber() {
        return super.getAsInteger("saleNumber").intValue();
    }

    public String getStartDate() {
        return super.getAsString("startDate");
    }

    public String getStateOrProvince() {
        return super.getAsString("stateOrProvince");
    }

    public int getStoreStatus() {
        return super.getAsInteger("storeStatus").intValue();
    }

    public String getSubThoroughfare() {
        return super.getAsString("subThoroughfare");
    }

    public String getSubject() {
        return super.getAsString("subject");
    }

    public int getSupportsNavigation() {
        return super.getAsInteger("supportsNavigation").intValue();
    }

    public int getSupportsPhoneCall() {
        return super.getAsInteger("supportsPhoneCall").intValue();
    }

    public String getTag() {
        return super.getAsString("tag");
    }

    public String getTextContent() {
        return super.getAsString("textContent");
    }

    public String getTheme() {
        return super.getAsString("theme");
    }

    public String getThoroughfare() {
        return super.getAsString("thoroughfare");
    }

    public String getThumbnailURL() {
        return super.getAsString("thumbnailURL");
    }

    public String getTitle() {
        return super.getAsString("title");
    }

    public String getUniqueIdentifier() {
        return super.getAsString("uniqueIdentifier");
    }

    public String getUrl() {
        return super.getAsString("url");
    }

    public long getUserCreated() {
        return super.getAsLong("userCreated").longValue();
    }

    public String getWebPageUrl() {
        return super.getAsString("webPageUrl");
    }

    public void setAction(String str) {
        this.action = str;
        super.put("action", str);
    }

    public void setActionIdentifiers(String str) {
        this.actionIdentifiers = str;
        super.put("actionIdentifiers", str);
    }

    public void setActivityKeywords(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.activityKeywords = stringBuffer2;
        super.put("activityKeywords", stringBuffer2);
    }

    public void setActivityTitle(String str) {
        this.activityTitle = str;
        super.put("activityTitle", str);
    }

    public void setActivityType(String str) {
        this.activityType = str;
        super.put("activityType", str);
    }

    public void setAdditionalRecipients(String str) {
        this.additionalRecipients = str;
        super.put("additionalRecipients", str);
    }

    public void setAlbum(String str) {
        this.album = str;
        super.put("album", str);
    }

    public void setAlternateNames(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.alternateNames = stringBuffer2;
        super.put("alternateNames", stringBuffer2);
    }

    public void setAppType(int i) {
        this.appType = i;
        super.put(RVConstants.EXTRA_APPTYPE, Integer.valueOf(i));
    }

    public void setArtist(String str) {
        this.artist = str;
        super.put("artist", str);
    }

    public void setAuthors(String str) {
        this.authors = str;
        super.put("authors", str);
    }

    public void setCSActionIdentifier(String str) {
        this.CSActionIdentifier = str;
        super.put("CSActionIdentifier", str);
    }

    public void setCategory(String str) {
        this.category = str;
        super.put("category", str);
    }

    public void setCity(String str) {
        this.city = str;
        super.put("city", str);
    }

    public void setComment(String str) {
        this.comment = str;
        super.put(to8.COMMENT, str);
    }

    public void setCompletionDate(Date date) {
        String format = this.smFormat.format(date);
        this.completionDate = format;
        super.put("completionDate", format);
    }

    public void setComponentName(String str) {
        this.componentName = str;
        super.put("componentName", str);
    }

    public void setContentDescription(String str) {
        this.contentDescription = str;
        super.put("contentDescription ", str);
    }

    public void setContentRating(float f) {
        this.contentRating = f;
        super.put("contentRating", Float.valueOf(f));
    }

    public void setContentType(String str) {
        this.contentType = str;
        super.put("contentType", str);
    }

    public void setContentURL(URL url) {
        String url2 = url.toString();
        this.contentURL = url2;
        super.put("contentURL", url2);
    }

    public void setCountry(String str) {
        this.country = str;
        super.put("country", str);
    }

    public void setCreator(String str) {
        this.creator = str;
        super.put("creator", str);
    }

    public boolean setCustomValues(String str, IndexForm indexForm) {
        if (indexForm == null || str == null) {
            return false;
        }
        super.put(indexForm.getIndexFieldName(), str);
        return true;
    }

    public void setDarkThumbnailURL(String str) {
        this.darkThumbnailURL = str;
        super.put("darkThumbnailURL", str);
    }

    public void setDataMimeType(String str) {
        this.dataMimeType = str;
        super.put("dataMimeType", str);
    }

    public void setDataURI(String str) {
        this.dataURI = str;
        super.put("dataURI", str);
    }

    public void setDescription(String str) {
        this.description = str;
        super.put("description", str);
    }

    public void setDisplayName(String str) {
        this.displayName = str;
        super.put(SimpleProfile.KEY_DISPLAYNAME, str);
    }

    public void setDownloadedDate(Date date) {
        String format = this.smFormat.format(this.metadataModificationDate);
        this.downloadedDate = format;
        super.put("downloadedDate", format);
    }

    public void setDueDate(Date date) {
        String format = this.smFormat.format(date);
        this.dueDate = format;
        super.put("dueDate", format);
    }

    public void setDuration(long j) {
        this.duration = j;
        super.put("duration", Long.valueOf(j));
    }

    public void setEndDate(Date date) {
        String format = this.smFormat.format(date);
        this.endDate = format;
        super.put("endDate", format);
    }

    public void setExpirationDate(Date date) {
        if (date.compareTo(new Date()) <= 0) {
            DSLog.et(TAG, "the expirationDate cannot less than currentTime.", new Object[0]);
            return;
        }
        String format = this.smFormat.format(date);
        this.expirationDate = format;
        super.put("expirationDate", format);
    }

    public void setFileSize(long j) {
        this.fileSize = j;
        super.put("fileSize", Long.valueOf(j));
    }

    public void setGenre(String str) {
        this.genre = str;
        super.put("genre", str);
    }

    public void setGpsAreaInformation(String str) {
        this.gpsAreaInformation = str;
        super.put("gpsAreaInformation", str);
    }

    public void setGroupId(String str) {
        this.groupId = str;
        super.put("groupId", str);
    }

    public void setHiddenAdditionalRecipients(String str) {
        this.hiddenAdditionalRecipients = str;
        super.put("hiddenAdditionalRecipients", str);
    }

    public void setIdentifier(String str) {
        this.identifier = str;
        super.put("identifier", str);
    }

    public void setImportantDates(Date[] dateArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Date date : dateArr) {
            stringBuffer.append(this.smFormat.format(date) + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.importantDates = stringBuffer2;
        super.put("importantDates", stringBuffer2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsAddedtoChart(boolean z) {
        this.isAddedtoChart = z ? 1 : 0;
        super.put("isAddedtoChart", Integer.valueOf((int) z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsAddedtoCollection(boolean z) {
        this.isAddedtoCollection = z ? 1 : 0;
        super.put("isAddedtoCollection", Integer.valueOf((int) z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsBrowsed(boolean z) {
        this.isBrowsed = z ? 1 : 0;
        super.put("isBrowsed", Integer.valueOf((int) z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsEligibleForHandoff(boolean z) {
        this.isEligibleForHandoff = z ? 1 : 0;
        super.put("isEligibleForHandoff", Integer.valueOf((int) z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsEligibleForPublicIndexing(boolean z) {
        this.isEligibleForPublicIndexing = z ? 1 : 0;
        super.put("isEligibleForPublicIndexing", Integer.valueOf((int) z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIsPriceDrop(boolean z) {
        this.isPriceDrop = z ? 1 : 0;
        super.put("isPriceDrop", Integer.valueOf((int) z));
    }

    public void setIsUserActivity(int i) {
        this.isUserActivity = i;
        super.put("isUserActivity", Integer.valueOf(i));
    }

    public void setKeyWords(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.keyWords = stringBuffer2;
        super.put("keyWords", stringBuffer2);
    }

    public void setKind(String str) {
        this.kind = str;
        super.put("kind", str);
    }

    public void setLastUsedDate(Date date) {
        String format = this.smFormat.format(date);
        this.lastUsedDate = format;
        super.put("lastUsedDate", format);
    }

    public void setLatitude(float f) {
        this.latitude = f;
        super.put("latitude", Float.valueOf(f));
    }

    public void setLikelyJunk(int i) {
        this.likelyJunk = i;
        super.put("likelyJunk", Integer.valueOf(i));
    }

    public void setLocal(int i) {
        this.local = i;
        super.put("local", Integer.valueOf(i));
    }

    public void setLogoURL(String str) {
        this.logoURL = str;
        super.put("logoURL", str);
    }

    public void setLongitude(float f) {
        this.longitude = f;
        super.put("longitude", Float.valueOf(f));
    }

    public void setLyricist(String str) {
        this.lyricist = str;
        super.put("lyricist", str);
    }

    public void setMetadataModificationDate(Date date) {
        String format = this.smFormat.format(date);
        this.metadataModificationDate = format;
        super.put("metadataModificationDate", format);
    }

    public void setMusicalGenre(String str) {
        this.musicalGenre = str;
        super.put("musicalGenre", str);
    }

    public void setNamedLocation(String str) {
        this.namedLocation = str;
        super.put("namedLocation", str);
    }

    public void setOrderDeliverDetails(String str) {
        this.orderDeliverDetails = str;
        super.put("orderDeliverDetails", str);
    }

    public void setOrderStatus(int i) {
        this.orderStatus = i;
        super.put("orderStatus", Integer.valueOf(i));
    }

    public void setOriginalSource(String str) {
        this.originalSource = str;
        super.put("originalSource", str);
    }

    public void setPath(String str) {
        this.path = str;
        super.put("path", str);
    }

    public void setPerformers(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.performers = stringBuffer2;
        super.put("performers", stringBuffer2);
    }

    public void setPersistentIdentifier(String str) {
        this.persistentIdentifier = str;
        super.put("persistentIdentifier", str);
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
        super.put(TrtcConstants.TRTC_PARAMS_PHONE_NUMBER, str);
    }

    public void setPhoneNumbers(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.phoneNumbers = stringBuffer2;
        super.put("phoneNumbers", stringBuffer2);
    }

    public void setPixelHeight(float f) {
        this.pixelHeight = f;
        super.put("pixelHeight", Float.valueOf(f));
    }

    public void setPixelWidth(float f) {
        this.pixelWidth = f;
        super.put("pixelWidth", Float.valueOf(f));
    }

    public void setPlayCount(long j) {
        this.playCount = j;
        super.put("playCount", Long.valueOf(j));
    }

    public void setPrimaryRecipients(String str) {
        this.primaryRecipients = str;
        super.put("primaryRecipients", str);
    }

    public void setProducer(String str) {
        this.producer = str;
        super.put("producer", str);
    }

    public void setProductPrice(float f) {
        this.productPrice = f;
        super.put("productPrice", Float.valueOf(f));
    }

    public void setProductRating(float f) {
        this.productRating = f;
        super.put("productRating", Float.valueOf(f));
    }

    public void setRankingHint(float f) {
        this.rankingHint = f;
        super.put("rankingHint", Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRankingTag(boolean z) {
        this.rankingTag = z ? 1 : 0;
        super.put("rankingTag", Integer.valueOf((int) z));
    }

    public void setRating(float f) {
        this.rating = f;
        super.put("rating", Float.valueOf(f));
    }

    public void setRatingDescription(String str) {
        this.ratingDescription = str;
        super.put("ratingDescription", str);
    }

    public void setSaleNumber(int i) {
        this.saleNumber = i;
        super.put("saleNumber", Integer.valueOf(i));
    }

    public void setStartDate(Date date) {
        String format = this.smFormat.format(date);
        this.startDate = format;
        super.put("startDate", format);
    }

    public void setStateOrProvince(String str) {
        this.stateOrProvince = str;
        super.put("stateOrProvince", str);
    }

    public void setStoreStatus(int i) {
        this.storeStatus = i;
        super.put("storeStatus", Integer.valueOf(i));
    }

    public void setSubThoroughfare(String str) {
        this.subThoroughfare = str;
        super.put("subThoroughfare", str);
    }

    public void setSubject(String str) {
        this.subject = str;
        super.put("subject", str);
    }

    public void setSupportsNavigation(int i) {
        this.supportsNavigation = i;
        super.put("supportsNavigation", Integer.valueOf(i));
    }

    public void setSupportsPhoneCall(int i) {
        this.supportsPhoneCall = i;
        super.put("supportsPhoneCall", Integer.valueOf(i));
    }

    public void setTag(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i] + ",");
        }
        String stringBuffer2 = stringBuffer.toString();
        this.tag = stringBuffer2;
        super.put("tag", stringBuffer2);
    }

    public void setTextContent(String str) {
        this.textContent = str;
        super.put("textContent", str);
    }

    public void setTheme(String str) {
        this.theme = str;
        super.put("theme", str);
    }

    public void setThoroughfare(String str) {
        this.thoroughfare = str;
        super.put("thoroughfare", str);
    }

    public void setThumbnailURL(String str) {
        this.thumbnailURL = str;
        super.put("thumbnailURL", str);
    }

    public void setTitle(String str) {
        this.title = str;
        super.put("title", str);
    }

    public void setUniqueIdentifier(String str) {
        this.uniqueIdentifier = str;
        super.put("uniqueIdentifier", str);
    }

    public void setUrl(URL url) {
        String url2 = url.toString();
        this.url = url2;
        super.put("url", url2);
    }

    public void setUserCreated(long j) {
        this.userCreated = j;
        super.put("userCreated", Long.valueOf(j));
    }

    public void setWebPageUrl(String str) {
        this.webPageUrl = str;
        super.put("webPageUrl", str);
    }

    public boolean setCustomValues(Long l, IndexForm indexForm) {
        if (indexForm == null || l == null) {
            return false;
        }
        super.put(indexForm.getIndexFieldName(), l);
        return true;
    }

    public boolean setCustomValues(Double d, IndexForm indexForm) {
        if (indexForm == null || d == null) {
            return false;
        }
        super.put(indexForm.getIndexFieldName(), d);
        return true;
    }

    public boolean setCustomValues(Integer num, IndexForm indexForm) {
        if (indexForm == null || num == null) {
            return false;
        }
        super.put(indexForm.getIndexFieldName(), num);
        return true;
    }

    public boolean setCustomValues(Float f, IndexForm indexForm) {
        if (indexForm == null || f == null) {
            return false;
        }
        super.put(indexForm.getIndexFieldName(), f);
        return true;
    }
}
