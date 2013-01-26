(ns clj-ec2.core
  (:import com.amazonaws.services.ec2.AmazonEC2Client
           com.amazonaws.auth.BasicAWSCredentials
           java.util.List
           (com.amazonaws.services.ec2.model DescribeBundleTasksResult DescribeAvailabilityZonesRequest DescribeBundleTasksRequest Filter
                                             AvailabilityZoneMessage BundleTask AvailabilityZone)))

(def endpoints {})

(defn credentials []
  "BLA")

(defn endpoint []
  (endpoints (keyword (get (System/getenv) "EC2_REGION"))))

(def ^AmazonEC2Client client (delay
                              (doto (AmazonEC2Client. (BasicAWSCredentials. (:AWSAccessKeyId (credentials)) (:AWSSecretKey (credentials))))
                                (.setEndpoint (endpoint)))))

;; void 	activateLicense(ActivateLicenseRequest activateLicenseRequest)

;; AllocateAddressResult 	allocateAddress()
;; AllocateAddressResult 	allocateAddress(AllocateAddressRequest allocateAddressRequest)
;; AssociateAddressResult 	associateAddress(AssociateAddressRequest associateAddressRequest)

;; void 	assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest)

;; void 	associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest)
;; AssociateRouteTableResult 	associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest)
;; void 	attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest)
;; AttachNetworkInterfaceResult 	attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest)
;; AttachVolumeResult 	attachVolume(AttachVolumeRequest attachVolumeRequest)

;; AttachVpnGatewayResult 	attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest)

;; void 	authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest)
;; void 	authorizeSecurityGroupIngress()
;; void 	authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest)

;; BundleInstanceResult 	bundleInstance(BundleInstanceRequest bundleInstanceRequest)

;; CancelBundleTaskResult 	cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest)

;; void 	cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest)

;; void 	cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)

;; CancelReservedInstancesListingResult 	cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest)

;; CancelSpotInstanceRequestsResult 	cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest)

;; ConfirmProductInstanceResult 	confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest)

;; CopySnapshotResult 	copySnapshot(CopySnapshotRequest copySnapshotRequest)

;; CreateCustomerGatewayResult 	createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest)
;; CreateDhcpOptionsResult 	createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest)

;; CreateImageResult 	createImage(CreateImageRequest createImageRequest)
;; CreateInstanceExportTaskResult 	createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest)
;; CreateInternetGatewayResult 	createInternetGateway()
;; CreateInternetGatewayResult 	createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest)
;; CreateKeyPairResult 	createKeyPair(CreateKeyPairRequest createKeyPairRequest)
;; CreateNetworkAclResult 	createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest)
;; void 	createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest)
;; CreateNetworkInterfaceResult 	createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest)
;; void 	createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest)
;; CreateReservedInstancesListingResult 	createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest)
;; void 	createRoute(CreateRouteRequest createRouteRequest)
;; CreateRouteTableResult 	createRouteTable(CreateRouteTableRequest createRouteTableRequest)
;; CreateSecurityGroupResult 	createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest)
;; CreateSnapshotResult 	createSnapshot(CreateSnapshotRequest createSnapshotRequest)
;; CreateSpotDatafeedSubscriptionResult 	createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest)
;; CreateSubnetResult 	createSubnet(CreateSubnetRequest createSubnetRequest)

;; void 	createTags(CreateTagsRequest createTagsRequest)

;; CreateVolumeResult 	createVolume(CreateVolumeRequest createVolumeRequest)

;; CreateVpcResult 	createVpc(CreateVpcRequest createVpcRequest)

;; CreateVpnConnectionResult 	createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest)
;; void 	createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest)
;; CreateVpnGatewayResult 	createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest)
;; void 	deactivateLicense(DeactivateLicenseRequest deactivateLicenseRequest)
;; void 	deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest)
;; void 	deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest)
;; void 	deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest)
;; void 	deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest)
;; void 	deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest)
;; void 	deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest)
;; void 	deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest)
;; void 	deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest)
;; void 	deleteRoute(DeleteRouteRequest deleteRouteRequest)
;; void 	deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest)
;; void 	deleteSecurityGroup()
;; void 	deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest)
;; void 	deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest)
;; void 	deleteSpotDatafeedSubscription()
;; void 	deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest)
;; void 	deleteSubnet(DeleteSubnetRequest deleteSubnetRequest)
;; void 	deleteTags(DeleteTagsRequest deleteTagsRequest)
;; void 	deleteVolume(DeleteVolumeRequest deleteVolumeRequest)
;; void 	deleteVpc(DeleteVpcRequest deleteVpcRequest)
;; void 	deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest)
;; void 	deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest)
;; void 	deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest)
;; void 	deregisterImage(DeregisterImageRequest deregisterImageRequest)


;; DescribeAddressesResult 	describeAddresses()
;; DescribeAddressesResult 	describeAddresses(DescribeAddressesRequest describeAddressesRequest)

(defn filters->map [^Filter filter]
  {:name (.getName filter)
   :values (.getValues filter)})

(defn availability-zone-message->map [^AvailabilityZoneMessage azm]
  {:message (.getMessage azm)})

(defn availability-zone->map [^AvailabilityZone az]
  {:messages (map availability-zone-message->map (.getMessages az))
   :region-name (.getRegionName az)
   :state (.getState az)
   :zone-name (.getZoneName az)})

(defn bundle-task->map [^BundleTask bundle-task]
  {:bundle-id (.getBundleId bundle-task)
   :bundle-task-error (.getBundleTaskError bundle-task)
   :instance-id (.getInstanceId bundle-task)
   :progress (.getProgress bundle-task)
   :start-time (.getStartTime bundle-task)
   :state (.getState bundle-task)
   :storage (.getStorage bundle-task)
   :update-time (.getUpdateTime bundle-task)})

(defn describe-bundle-tasks-result->map [^DescribeBundleTasksResult res]
  {:bundle-tasks (map bundle-task->map (.getBundleTasks res))})

(defn describe-availability-zones
  ([]
     (.describeAvailabilityZones @client))
  ([m]
     (let [dazreq (doto (DescribeAvailabilityZonesRequest.)
                    (.setFilters ^java.util.Collection<Filter> (map filters->map (:filters m)))
                    (.setZoneNames ^java.util.Collection<String> (:zone-names m)))]
       (availability-zone->map (.describeAvailabilityZones @client ^DescribeAvailabilityZonesRequest dazreq)))))

;; BundleTaskError 	getBundleTaskError()
;; java.util.Date 	getStartTime()
;; Storage 	        getStorage()

(defn describe-bundle-tasks
  ([]
     (.describeBundleTasks @client))
  ([m]
     (let [dbtreq (doto (DescribeBundleTasksRequest.)
                    (.setBundleIds ^java.util.Collection<String> (:bundle-ids m))
                    (.setFilters ^java.util.Collection<Filter (:filters m)))]
       (.describeBundleTasks @client dbtreq))))

;; DescribeConversionTasksResult 	describeConversionTasks()
;; DescribeConversionTasksResult 	describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest)
;; DescribeCustomerGatewaysResult 	describeCustomerGateways()
;; DescribeCustomerGatewaysResult 	describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest)
;; DescribeDhcpOptionsResult 	describeDhcpOptions()
;; DescribeDhcpOptionsResult 	describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest)
;; DescribeExportTasksResult 	describeExportTasks()
;; DescribeExportTasksResult 	describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest)
;; DescribeImageAttributeResult 	describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest)
;; DescribeImagesResult 	describeImages()
;; DescribeImagesResult 	describeImages(DescribeImagesRequest describeImagesRequest)
;; DescribeInstanceAttributeResult 	describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
;; DescribeInstancesResult 	describeInstances()
;; DescribeInstancesResult 	describeInstances(DescribeInstancesRequest describeInstancesRequest)
;; DescribeInstanceStatusResult 	describeInstanceStatus()
;; DescribeInstanceStatusResult 	describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest)
;; DescribeInternetGatewaysResult 	describeInternetGateways()
;; DescribeInternetGatewaysResult 	describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest)
;; DescribeKeyPairsResult 	describeKeyPairs()
;; DescribeKeyPairsResult 	describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest)
;; DescribeLicensesResult 	describeLicenses()
;; DescribeLicensesResult 	describeLicenses(DescribeLicensesRequest describeLicensesRequest)
;; DescribeNetworkAclsResult 	describeNetworkAcls()
;; DescribeNetworkAclsResult 	describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest)
;; DescribeNetworkInterfaceAttributeResult 	describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest)
;; DescribeNetworkInterfacesResult 	describeNetworkInterfaces()
;; DescribeNetworkInterfacesResult 	describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest)
;; DescribePlacementGroupsResult 	describePlacementGroups()
;; DescribePlacementGroupsResult 	describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest)
;; DescribeRegionsResult 	describeRegions()
;; DescribeRegionsResult 	describeRegions(DescribeRegionsRequest describeRegionsRequest)
;; DescribeReservedInstancesResult 	describeReservedInstances()
;; DescribeReservedInstancesResult 	describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest)
;; DescribeReservedInstancesListingsResult 	describeReservedInstancesListings()
;; DescribeReservedInstancesListingsResult 	describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest)
;; DescribeReservedInstancesOfferingsResult 	describeReservedInstancesOfferings()
;; DescribeReservedInstancesOfferingsResult 	describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest)
;; DescribeRouteTablesResult 	describeRouteTables()
;; DescribeRouteTablesResult 	describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest)
;; DescribeSecurityGroupsResult 	describeSecurityGroups()
;; DescribeSecurityGroupsResult 	describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
;; DescribeSnapshotAttributeResult 	describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest)
;; DescribeSnapshotsResult 	describeSnapshots()
;; DescribeSnapshotsResult 	describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest)
;; DescribeSpotDatafeedSubscriptionResult 	describeSpotDatafeedSubscription()
;; DescribeSpotDatafeedSubscriptionResult 	describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest)
;; DescribeSpotInstanceRequestsResult 	describeSpotInstanceRequests()
;; DescribeSpotInstanceRequestsResult 	describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest)
;; DescribeSpotPriceHistoryResult 	describeSpotPriceHistory()
;; DescribeSpotPriceHistoryResult 	describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest)
;; DescribeSubnetsResult 	describeSubnets()
;; DescribeSubnetsResult 	describeSubnets(DescribeSubnetsRequest describeSubnetsRequest)
;; DescribeTagsResult 	describeTags()
;; DescribeTagsResult 	describeTags(DescribeTagsRequest describeTagsRequest)
;; DescribeVolumeAttributeResult 	describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest)
;; DescribeVolumesResult 	describeVolumes()
;; DescribeVolumesResult 	describeVolumes(DescribeVolumesRequest describeVolumesRequest)
;; DescribeVolumeStatusResult 	describeVolumeStatus()
;; DescribeVolumeStatusResult 	describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest)
;; DescribeVpcsResult 	describeVpcs()
;; DescribeVpcsResult 	describeVpcs(DescribeVpcsRequest describeVpcsRequest)
;; DescribeVpnConnectionsResult 	describeVpnConnections()
;; DescribeVpnConnectionsResult 	describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest)
;; DescribeVpnGatewaysResult 	describeVpnGateways()
;; DescribeVpnGatewaysResult 	describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest)
;; void 	detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest)
;; void 	detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest)
;; DetachVolumeResult 	detachVolume(DetachVolumeRequest detachVolumeRequest)
;; void 	detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest)
;; void 	disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest)
;; void 	disassociateAddress(DisassociateAddressRequest disassociateAddressRequest)
;; void 	disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest)
;; void 	enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest)
;; void 	enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest)
;; ResponseMetadata 	getCachedResponseMetadata(AmazonWebServiceRequest request)
;; GetConsoleOutputResult 	getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest)
;; GetPasswordDataResult 	getPasswordData(GetPasswordDataRequest getPasswordDataRequest)
;; ImportInstanceResult 	importInstance(ImportInstanceRequest importInstanceRequest)
;; ImportKeyPairResult 	importKeyPair(ImportKeyPairRequest importKeyPairRequest)
;; ImportVolumeResult 	importVolume()
;; ImportVolumeResult 	importVolume(ImportVolumeRequest importVolumeRequest)
;; void 	modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest)
;; void 	modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest)
;; void 	modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest)
;; void 	modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest)
;; void 	modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest)
;; MonitorInstancesResult 	monitorInstances(MonitorInstancesRequest monitorInstancesRequest)
;; PurchaseReservedInstancesOfferingResult 	purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest)
;; void 	rebootInstances(RebootInstancesRequest rebootInstancesRequest)
;; RegisterImageResult 	registerImage()
;; RegisterImageResult 	registerImage(RegisterImageRequest registerImageRequest)
;; void 	releaseAddress()
;; void 	releaseAddress(ReleaseAddressRequest releaseAddressRequest)
;; ReplaceNetworkAclAssociationResult 	replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest)
;; void 	replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest)
;; void 	replaceRoute(ReplaceRouteRequest replaceRouteRequest)
;; ReplaceRouteTableAssociationResult 	replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest)
;; void 	reportInstanceStatus()
;; void 	reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest)
;; RequestSpotInstancesResult 	requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest)
;; void 	resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest)
;; void 	resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest)
;; void 	resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest)
;; void 	resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest)
;; void 	revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest)
;; void 	revokeSecurityGroupIngress()
;; void 	revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest)
;; RunInstancesResult 	runInstances(RunInstancesRequest runInstancesRequest)
;; void 	setEndpoint(java.lang.String endpoint)
;; void 	shutdown()
;; StartInstancesResult 	startInstances(StartInstancesRequest startInstancesRequest)
;; StopInstancesResult 	stopInstances(StopInstancesRequest stopInstancesRequest)
;; TerminateInstancesResult 	terminateInstances(TerminateInstancesRequest terminateInstancesRequest)
;; void 	unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest)
;; UnmonitorInstancesResult 	unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest)
